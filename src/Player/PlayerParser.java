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
	
	String event_temp = null;   // ����
	String county_temp = null;  // ����
	String name_temp = null;    // �����̸�
	
	public PlayerParser(ArrayList<PlayerVO> PD) {
		
		try {
			doc = Jsoup.connect(url).get();
			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

//		HTML ȣ�� ����
		  
		
		System.out.println("Crawling complete");

	}
}


