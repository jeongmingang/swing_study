package swing_study.panel;

public class Title {
	private int tNo;
	private String tName;
	
	public Title() {
		// TODO Auto-generated constructor stub
	}

	public Title(int tNo) {
		this.tNo = tNo;
	}
	
	public Title(int tNo, String tName) {
		this.tNo = tNo;
		this.tName = tName;
	}
	
	public int gettNo() {
		return tNo;
	}
	
	public void settNo(int tNo) {
		this.tNo = tNo;
	}
	
	public String gettName() {
		return tName;
	}
	
	public void setName(String tName) {
		this.tName = tName;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s]", tNo, tName);
	}
	
}
