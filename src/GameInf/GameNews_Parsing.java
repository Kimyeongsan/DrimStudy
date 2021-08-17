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

		// �˻�â �Է�
		WebElement search = driver.findElement(By.id("query"));
		search.clear();
		search.sendKeys(news);

		// �˻� ��ư Ŭ��
		apply_btn = driver.findElement(By.id("search_btn"));
		apply_btn.click();
		
		// ���� Ŭ��
		news_btn = driver.findElement(By.xpath("//*[@id=\"lnb\"]/div[1]/div/ul/li[7]"));
		news_btn.click();

		// ù��° �������� ����� ���� �޾ƿ�
		title = driver.findElement(By.xpath("//*[@id=\"sp_nws1\"]/div[1]/div/a"));
		content = driver.findElement(By.xpath("//*[@id=\"sp_nws1\"]/div[1]/div/div[2]"));
		
		searchDAO.setNews(title.getText(), content.getText());
		
		list.add(searchDAO);
		
//	 	drimstudyDB s = new drimstudyDB(); // DB�Լ��� ȣ��
//	 	s.sendDB(data); // �ش� �Լ��� data�� ����
		
		GameInfPanel s = new GameInfPanel();
		s.OutputBox(searchDAO);
		
		
		// �ӽ� ���
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
