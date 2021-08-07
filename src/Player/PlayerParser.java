package Player;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PlayerParser {
	String url = "https://olympics.com/tokyo-2020/olympic-games/ko/results/";
	Document doc = null;     
	
	public PlayerParser() {
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements playerName = doc.select("div.sect-movie-chart");    

		//Iterator을 사용하여 하나씩 값 가져오기
		Iterator<Element> ie1 = playerName.select("strong.rank").iterator();
		Iterator<Element> ie2 = playerName.select("strong.title").iterator();
		        
		
		while (ie1.hasNext()) {
			System.out.println(ie1.next().text()+"\t"+ie2.next().text());
		}
	}
}


