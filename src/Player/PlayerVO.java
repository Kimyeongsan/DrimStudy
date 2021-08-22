package Player;

public class PlayerVO {
	String medal, carrier;
	
	
	public PlayerVO(String carrier) {
		//this.medal = medal;
		this.carrier = carrier;
	}

//	public String getMedal() {
//		return medal;
//	}
//
//	public void setMedal(String medal) {
//		this.medal = medal;
//	}


	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
}