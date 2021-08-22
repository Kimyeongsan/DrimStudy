package Player;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Database.playerDB;

public class PlayerParser {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; // ����̹� ID
	public static final String WEB_DRIVER_PATH = "src/chromedriver.exe"; // ����̹� ���
	WebDriver driver;

	public PlayerParser() {

	}

	public String PlayerSearch() {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
			String url = "https://www.naver.com/"; // �ι� �˻�â

			ChromeOptions options = new ChromeOptions();
			playerDB playerDB =new playerDB();
			//options.addArguments("headless");

			driver = new ChromeDriver(options);
			driver.get(url);

			// Thread.sleep(2000);
			
			//db���� ��ġ�� �������� �Լ�
			String playerName = playerDB.getPlayerName();
			String event = playerDB.getEvent() + "����";
			String country = playerDB.getCountry();

			System.out.println(playerName+"/"+event +"/"+country);
			// �̸� text �Է°�
			WebElement searchText = driver.findElement(By.id("query"));
			searchText.clear();
			searchText.sendKeys(playerName);
			
			driver.findElement(By.id("search_btn")).click();
			
			while(true) {
		    int i =1;
		    WebElement search = driver.findElement(By.xpath("//*[@id=\"people_info_z\"]/div/div[2]/div[1]/div/dl/dd[1]/span"));
		    WebElement search2 = driver.findElement(By.xpath("//*[@id=\"people_info_z\"]/div/div[2]/div[5]/div/ul/li["+i+"]/div[2]/span[1]"));
			
		    //�ش� ������ ������ Ŭ��
			if(event.equals(search.getText())) {
				System.out.println(search.getText());
				driver.findElement(By.className("btn_txt_more")).click();
				break;
			}
			else if(event.equals(search2.getText())) {
				System.out.println(search2.getText());
				driver.findElement(By.className("scm_cllipsis_ellipsis")).click();
				break;
			}
			else i++;		
			}
			Thread.sleep(2000);
			//#listUI_career > dd:nth-child(2) > p
//			
//			driver.switch_to.frame('main')
//
//			driver.switchTo();
			String textCarrier="";
			String carrier_xpath = "//*[@id=\"listUI_career\"]/dd[1]/p";

			WebElement element = driver.findElement(By.xpath(carrier_xpath));
			driver.switchTo().frame(element);
			//driver.findElement(By.xpath(carrier_xpath));
			Thread.sleep(2000);
//			Thread.sleep(1000);
			//driver.get("https://baud.teamwork.com/launchpad/login?continue=%2Fcrm");
			//WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.carrier_xpath, "//input[@id='loginemail']"))).send_keys("lucas@stackoverflow.com");
			textCarrier += element.getText()+"\n";
			return textCarrier;
			
			//WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Text2')]"));
			//String test = element.getText();
//			List<WebElement> carrier = new ArrayList<>();
//			//String[] carrier= {};
//			
//			for(int i=1;i<5;i++) {
//				
//				//carrier[i] = driver.findElement(By.xpath("//*[@id=\"listUI_career\"]/dd["+i+"]/p")).getString();
//				//carrier.add(driver.findElement(By.xpath(carrier_xpath)));
//				
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("player parsing ����!!!!!! ���� : " + e.getMessage());
		}
		return null;
	}
}