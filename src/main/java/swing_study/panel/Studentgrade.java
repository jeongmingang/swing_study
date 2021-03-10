package swing_study.panel;

public class Studentgrade {
	private int stdNo;
	private String stdName;
	private String ban;
	private int kor;
	private int eng;
	private int math;
	private int soc;
	private int sci;
	
	public Studentgrade(int stdNo) {
		this.stdNo = stdNo;
	}

	public Studentgrade(int stdNo, String stdName, String ban, int kor, int eng, int math, int soc, int sci) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.soc = soc;
		this.sci = sci;
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSoc() {
		return soc;
	}

	public void setSoc(int soc) {
		this.soc = soc;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	@Override
	public String toString() {
		return String.format("Studentgrade [%s, %s, %s, %s, %s, %s, %s, %s]",
				stdNo, stdName, ban, kor, eng, math, soc, sci);
	}
	
	


}
