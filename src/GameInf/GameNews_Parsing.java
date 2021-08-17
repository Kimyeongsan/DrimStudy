package GameInf;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GameNews_Parsing {
	Game_Parser game_Parser;
	WebDriver driver;
	WebElement apply_btn, news_btn, title, content;
	
	ArrayList<SearchDAO> list = new ArrayList<SearchDAO>();
	SearchDAO searchDAO = new SearchDAO();
	
	String url = "https://www.naver.com";

	GameNews_Parsing(String news) {
		game_Parser = new Game_Parser();
		Parsing_Data_init(news);
	}

	private void Parsing_Data_init(String news) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		driver = new ChromeDriver(options);
		driver.get(url);

		// 검색창 입력
		WebElement search = driver.findElement(By.id("query"));
		search.clear();
		search.sendKeys(news);

		// 검색 버튼 클릭
		apply_btn = driver.findElement(By.id("search_btn"));
		apply_btn.click();
		
		// 뉴스 클릭
		news_btn = driver.findElement(By.xpath("//*[@id=\"lnb\"]/div[1]/div/ul/li[7]"));
		news_btn.click();

		// 첫번째 뉴스에서 제목과 내용 받아옴
		title = driver.findElement(By.xpath("//*[@id=\"sp_nws1\"]/div[1]/div/a"));
		content = driver.findElement(By.xpath("//*[@id=\"sp_nws1\"]/div[1]/div/div[2]"));
		
		searchDAO.setNews(title.getText(), content.getText());
		
		list.add(searchDAO);
		
//	 	drimstudyDB s = new drimstudyDB(); // DB함수를 호출
//	 	s.sendDB(data); // 해당 함수에 data를 보내
		
		GameInfPanel s = new GameInfPanel();
		s.OutputBox(searchDAO);
		
		
		// 임시 출력
		System.out.println(title.getText() + "\n" + content.getText());

		try {
			if (driver != null) {
				driver.close();
				driver.quit();
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}

}
