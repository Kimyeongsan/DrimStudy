package Player;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PlayerParser {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; // 드라이버 ID
	public static final String WEB_DRIVER_PATH = "src/chromedriver.exe"; // 드라이버 경로
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
		String url = "https://people.search.naver.com/"; //인물 검색창
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		
		driver = new ChromeDriver(options);

		      //options.addArguments("headless");
		      
		      driver.get(url);
		      //Thread.sleep(2000);
		      
		      //이름 text 입력값
		      WebElement search = driver.findElement(By.id(" "));
		      search.clear();
		      //search.sendKeys(peopleSearch);
		      
		      //carrier = driver.findElement(By.xpath('//*[@id="listUI_prize"]/dd[1]'));
		      
		      // 검색 버튼 클릭
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
//            //get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
//            driver.get(base_url);
//            System.out.println(driver.getPageSource());
//            
//            //종목으로 재검색
//          //*[@id="content"]/div/div[2]/div[1]/a/img
//            //사진
//            
//            //수상경력
//            //*[@id="listUI_prize"]/dd[1]
//
//            //경력
//            //*[@id="listUI_career"]
//          //*[@id="listUI_career"]/dd[1]
//            
//            //머넣더라
//            //국가명, 종목명 -> 드롭박스 이름?
//            //DB 저장만
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
