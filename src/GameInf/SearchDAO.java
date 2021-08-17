package GameInf;

public class SearchDAO {
	private String news;
	private String schedule;
	private String rank;
	
	private String Title;
	private String Content;
	
	public String getSchedule() {
		return schedule;
	}
	
	public String getRank() {
		return rank;
	}
	
	public String getNews() {
		return Title + "\n "+ Content;
	}
	
	public void setNews(String title, String content) {
		this.Title = title;
		this.Content = content;
	}

	public void setSchedule(String scheduleSearch) {
		this.schedule = scheduleSearch;
	}

	public void setRank(String rankSearch) {
		this.rank = rankSearch;
	}
}
