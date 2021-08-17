package GameInf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GameNews_Parsing {
	Game_Parser game_Parser;
	
	String url = "https://www.naver.com";
	
	GameNews_Parsing() {
		game_Parser = new Game_Parser();
		Parsing_Data_init();
	}
	
	private void Parsing_Data_init() {

		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);

		List<WebElement> el1 = driver.findElements(By.className("nav"));

		for (int i = 0; i < el1.size(); i++) {
			if (el1.get(i).getText().equals("뉴스")) {
				el1.get(i).click();
				break;
			}
		}

		// 1초 대기
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		// iT/과학뉴스를 담은 div
		WebElement el2 = driver.findElement(By.id("section_it"));

		// div속에서 strong태그를 가진 모든 element를 받아온다.
		List<WebElement> el3 = el2.findElements(By.tagName("strong"));

		int count = 0;
		for (int i = 0; i < el3.size(); i++) {
			// 뉴스의 제목을 모두 출력한다.
			System.out.println(++count + "번 뉴스: " + el3.get(i).getText());
		}
		
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
