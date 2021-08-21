package GameInf;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CrawlingDAO {
	
	static void NewsCrawling(String newsSearch, ArrayList<SearchVO> SL) {
		
		WebDriver driver;
		WebElement apply_btn, title, content, img;
		
		String newsTitle = null;
		String newsContent = null;
		
		String url = "https://www.naver.com";
		
		Game_Parser game_Parser = new Game_Parser();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		driver = new ChromeDriver(options);
		driver.get(url);

		// 검색창 입력
		WebElement search = driver.findElement(By.id("query"));
		search.clear();
		search.sendKeys(newsSearch);

		// 검색 버튼 클릭
		apply_btn = driver.findElement(By.id("search_btn"));
		apply_btn.click();

		List<WebElement> el1 = driver.findElements(By.className("menu"));

		for (int i = 0; i < el1.size(); i++) {
			if (el1.get(i).getText().equals("뉴스")) {
				el1.get(i).click();
				break;
			}
		}

		// 첫번째 뉴스에서 제목과 내용 받아옴
		title = driver.findElement(By.xpath("//*[@id=\"sp_nws1\"]/div[1]/div/a"));
		content = driver.findElement(By.xpath("//*[@id=\"sp_nws1\"]/div[1]/div/div[2]"));
		
		img = driver.findElement(By.xpath("//*[@id=\"sp_nws1\"]/div[1]/a"));
		
		newsTitle = title.getText();
		newsContent = content.getText();
		
		SL.add(new SearchVO(newsTitle, newsContent));
		
		System.out.println(newsTitle + "\n" + newsContent);
		
		try {
			if (driver != null) {
				driver.close();
				driver.quit();
			}

		} catch (Exception e1) {
			throw new RuntimeException(e1.getMessage());
		}
	}
	
	
	/////////////////////////////////////////
	
	static void RankCrawling(ArrayList<RankVO> SL) {
		
		WebDriver driver;
		WebElement apply_btn;
		
		String url = "https://www.naver.com";
		
		String country, gold, silver, bronze, total;
		
		Game_Parser game_Parser = new Game_Parser();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		driver = new ChromeDriver(options);
		driver.get(url);

		// 검색창 입력
		WebElement search = driver.findElement(By.id("query"));
		search.clear();
		search.sendKeys("도쿄올림픽");

		// 검색 버튼 클릭
		apply_btn = driver.findElement(By.id("search_btn"));
		apply_btn.click();

		
//		List<WebElement> el2 = driver.findElements(By.className("gold"));
//		List<WebElement> el3 = driver.findElements(By.className("silver"));
//		List<WebElement> el4 = driver.findElements(By.className("bronze"));
//		List<WebElement> el5 = driver.findElements(By.className("total"));
		
		for (int i = 0; i < 10; i++) {
			
			List<WebElement> el1 = driver.findElements(By.xpath("//*[@id=\"main_pack\"]/section[2]/div/div[2]/div[2]/div[3]/div/div[1]/table/tbody/tr["+ i +"]/td[1]/p/a[2]"));
			country = el1.get(i).getText();
			
			
//			gold = el2.get(i).getText();
//			silver = el3.get(i).getText();
//			bronze = el4.get(i).getText();
//			total = el5.get(i).getText();
			
//			SL.add(new RankVO(country, gold, silver, bronze, total));
			
			System.out.println(country);
		}
		
		
//		List<WebElement> el1 = driver.findElements(By.className("menu"));
//
//		for (int i = 0; i < el1.size(); i++) {
//			if (el1.get(i).getText().equals("뉴스")) {
//				el1.get(i).click();
//				break;
//			}
//		}
		

		try {
			if (driver != null) {
				driver.close();
				driver.quit();
			}

		} catch (Exception e1) {
			throw new RuntimeException(e1.getMessage());
		}
	}
	
}
