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
//    //ũ�Ѹ� �� URL
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
//}