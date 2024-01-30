package StudentBase;

public class Student {
	private String fName;
	private String lName;
	private String fullName;
	private int mjava;
	private int mWeb;
	private int mDataBase;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public void setFullName(String fName,String lName) {
		this.fullName = fName+" "+lName;
	}
	public String getFullName() {
		setFullName(fName,lName);
		return fullName;
	}
	public int getMjava() {
		return mjava;
	}
	public void setMjava(int mjava) {
		this.mjava = mjava;
	}
	public int getmWeb() {
		return mWeb;
	}
	public void setmWeb(int mWeb) {
		this.mWeb = mWeb;
	}
	public int getmDataBase() {
		return mDataBase;
	}
	public void setmDataBase(int mDataBase) {
		this.mDataBase = mDataBase;
	}
	
	public int totalMarks() {

		return getMjava()+getmWeb()+getmDataBase();

	}

	public int percentage() {

	    return (totalMarks() * 100) / 300;

	}

	public String batch() {
		if(percentage()>=85) {

			return "Gold (PASS)";
		}
		else if (percentage()>60 && percentage()<85 ) {

			return "Silver (PASS)";

		}
		else if (percentage()>50 && percentage()<60 ) {
			return "Bronze (PASS)";
		}
		return "Fail";
	}
}
