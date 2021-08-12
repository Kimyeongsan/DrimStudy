package Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PlayerParser {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; // ����̹� ID
	public static final String WEB_DRIVER_PATH = "src/chromedriver.exe"; // ����̹� ���

	public PlayerParser() {

		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);

		// �̵��� ���ϴ� url
		String url = "https://www.naver.com";
		driver.get(url);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		List<WebElement> el1 = driver.findElements(By.className("nav"));

		for (int i = 0; i < el1.size(); i++) {
			// nav Ŭ������ ��ü �� "����"��� �ؽ�Ʈ�� ���� WebElement�� Ŭ���Ѵ�.
			if (el1.get(i).getText().equals("����")) {
				el1.get(i).click();
				break;
			}
		}

		// 1�� ���
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		// iT/���д����� ���� div
		WebElement el2 = driver.findElement(By.id("section_it"));

		// div�ӿ��� strong�±׸� ���� ��� element�� �޾ƿ´�.
		List<WebElement> el3 = el2.findElements(By.tagName("strong"));

		int count = 0;
		for (int i = 0; i < el3.size(); i++) {
			// ������ ������ ��� ����Ѵ�.
			System.out.println(++count + "�� ����: " + el3.get(i).getText());
		}

		try {
			// ����̹��� null�� �ƴ϶��
			if (driver != null) {
				// ����̹� ���� ����
				driver.close(); // ����̹� ���� ����

				// ���μ��� ����
				driver.quit();
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}
}
