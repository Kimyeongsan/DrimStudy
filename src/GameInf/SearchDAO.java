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
	
	// News Part
	public String getNews() {
		return news;
	}
	
	
	public String getTitle() {
		return Title;
	}
	
	
	public String getContent() {
		return Content;
	}
	
	
	public void setSchedule(String scheduleSearch) {
		this.schedule = scheduleSearch;
	}

	public void setRank(String rankSearch) {
		this.rank = rankSearch;
	}
	
	// News Part
	
	public void setNews(String news) {
		this.news = news;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void setContent(String content) {
		Content = content;
	}
	

}