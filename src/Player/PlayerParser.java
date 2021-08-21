package Player;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PlayerParser {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; // ����̹� ID
	public static final String WEB_DRIVER_PATH = "src/chromedriver.exe"; // ����̹� ���
	WebDriver driver;
	WebElement naver_btn, fullName, carrier;
	
	
	public PlayerParser() {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
			PlayerSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void PlayerSearch() {
		String url = "https://people.search.naver.com/"; //�ι� �˻�â
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		
		driver = new ChromeDriver(options);

		      //options.addArguments("headless");
		      
		      driver.get(url);
		      //Thread.sleep(2000);
		      
		      //�̸� text �Է°�
		      WebElement search = driver.findElement(By.id(" "));
		      search.clear();
		      //search.sendKeys(peopleSearch);
		      
		      //carrier = driver.findElement(By.xpath('//*[@id="listUI_prize"]/dd[1]'));
		      
		      // �˻� ��ư Ŭ��
		      naver_btn = driver.findElement(By.id("search_btn"));
		      naver_btn.click();
		      
		      //fullName = driver.findElement(By.xpath(peopleSearch));
		      
		      System.out.println(fullName.getText() + "\n" + carrier.getText());

		      try {
		          if (driver != null) {
		             driver.quit();
		          }

		       } catch (Exception e) {
		          throw new RuntimeException(e.getMessage());
		       }
	   }

	}
//    public void crawl() {
// 
//        try {
//            //get page (= ���������� url�� �ּ�â�� ���� �� request �� �Ͱ� ����)
//            driver.get(base_url);
//            System.out.println(driver.getPageSource());
//            
//            //�������� ��˻�
//          //*[@id="content"]/div/div[2]/div[1]/a/img
//            //����
//            
//            //������
//            //*[@id="listUI_prize"]/dd[1]
//
//            //���
//            //*[@id="listUI_career"]
//          //*[@id="listUI_career"]/dd[1]
//            
//            //�ӳִ���
//            //������, ����� -> ��ӹڽ� �̸�?
//            //DB ���常
//            
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//        
//        } finally {
// 
//            driver.close();
//        }
// 
//    }
//
