package Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PlayerParser {
	String url = "https://olympics.com/tokyo-2020/olympic-games/ko/results/all-sports/athletes.htm";
	Document doc = null;     
	Elements tmp;
	
	String event_temp = null;   // 종목
	String county_temp = null;  // 나라
	String name_temp = null;    // 선수이름
	
	public PlayerParser(ArrayList<PlayerVO> PD) {
		
		try {
			doc = Jsoup.connect(url).get();
			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

//		HTML 호출 예정
		  
		
		System.out.println("Crawling complete");

	}
}


