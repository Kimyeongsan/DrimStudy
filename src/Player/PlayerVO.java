package Player;

public class PlayerVO {
	String event;
	String country;	
	String name;
	
	public PlayerVO(String event, String country, String name) {
		this.event = event;
		this.country = country;
		this.name = name;
	}
	
	public String getEvent() {
		return event;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEvent(String Event) {
		event = Event;
	}
	
	public void setCountry(String Country) {
		country = Country;
	}
	
	public void setName(String Name) {
		name = Name;
	}
}
