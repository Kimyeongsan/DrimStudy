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
		return news;
	}
	
	
	public void setSchedule(String scheduleSearch) {
		this.schedule = scheduleSearch;
	}

	public void setRank(String rankSearch) {
		this.rank = rankSearch;
	}

	public void setNews(String news) {
		this.news = news;
	}
	
	
	// News Part
	
	public String getNewsContent() {
		return Title + "\n "+ Content;
	}
	
	public void setNewsContent(String title, String content) {
		this.Title = title;
		this.Content = content;
	}

}