//package Player;
//
//public class PlayerParser {
//   //WebDriver
//    private WebDriver driver;
//    
//    //Properties
//    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
//    public static final String WEB_DRIVER_PATH = "src/chromedriver.exe";
//    
//    //크롤링 할 URL
//    private String base_url;
//    
//    public SeleniumTest() {
//        super();
// 
//        //System Property SetUp
//        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
//        
//        //Driver SetUp
//        driver = new ChromeDriver();
//        base_url = "https://people.search.naver.com/";
//    }
// 
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
//}