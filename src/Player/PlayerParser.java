package Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;



public class PlayerParser {
	String url = "https://olympics.com/tokyo-2020/olympic-games/ko/results/all-sports/athletes.htm";

	String event_temp = null;   // 종목
	String county_temp = null;  // 나라
	String name_temp = null;    // 선수이름
	
	public PlayerParser(ArrayList<PlayerVO> PD) {
		

		System.out.println("Crawling complete");

	}
}


