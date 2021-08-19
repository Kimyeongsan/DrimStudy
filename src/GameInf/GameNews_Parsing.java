package GameInf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GameNews_Parsing extends JPanel{
   Game_Parser game_Parser;
   WebDriver driver;
   WebElement apply_btn, news_btn, title, content;
   
   String url = "https://www.naver.com";
   
   private String Fd;
   private String Ud;

   public void setFd(String x) {
      this.Fd = x;
   }

   public void setUd(String x) {
      this.Ud = x;
   }
   
   GameNews_Parsing() {
      game_Parser = new Game_Parser();
   }

   
   public void Parsing_Data_init(String news) {

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
      
      Fd = title.getText();
      Ud = content.getText();
      
      setFd(Fd);
      setUd(Ud);

//      System.out.println(title.getText() + " \n" + content.getText());
      
      
      
      JLabel newsImage = new JLabel();
      newsImage.setText(title.getText() + " \n" + content.getText());
      
      newsImage.setBounds(550, 375, 500, 200);
      newsImage.setFont(new Font("맑은 고딕", Font.BOLD, 35)); // Font
      newsImage.setForeground(Color.black); // Color
      

      try {
         if (driver != null) {
            driver.close();
            driver.quit();
         }

      } catch (Exception e) {
         throw new RuntimeException(e.getMessage());
      }

   }
   
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.setColor(Color.BLACK);
      g.drawString(Fd + " \n" + Ud, 5, 50);
      
      System.out.println(Fd + " \n" + Ud + "asdasdasdas");
      g.setColor(new Color(140, 155, 255));
   }
   
}