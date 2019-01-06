public class Student {

	public int studentOfficialId= 100;
	public int  stuOfficialPass=123;
	
	private int    StuId;
	private String StuName;
    private	String StuTypeOfCard;
	private String StuDateOfMembership;
	private boolean issused;
	
	
	public boolean isIssused() {
	    return issused;
	}
	public void setIssused(boolean issused) {
	    this.issused = issused;
	}
	
	public int getStudentOfficialId() {
		return studentOfficialId;
	}

	public void setStudentOfficialId(int studentOfficialId) {
		this.studentOfficialId = studentOfficialId;
	}

	public int getStuOfficialPass() {
		return stuOfficialPass;
	}

	public void setStuOfficialPass(int stuOfficialPass) {
		this.stuOfficialPass = stuOfficialPass;
	}

	public int getStuId() {
		return StuId;
	}

	public void setStuId(int stuId) {
		StuId = stuId;
	}

	public String getStuName() {
		return StuName;
	}

	public void setStuName(String stuName) {
		StuName = stuName;
	}

	public String getStuTypeOfCard() {
		return StuTypeOfCard;
	}

	public void setStuTypeOfCard(String stuTypeOfCard) {
		StuTypeOfCard = stuTypeOfCard;
	}

	public String getStuDateOfMembership() {
		return StuDateOfMembership;
	}

	public void setStuDateOfMembership(String stuDateOfMembership) {
		StuDateOfMembership = stuDateOfMembership;
	}

public Student(int stuid, String stuname, String stutypeofcard, String studateofmembership,boolean issused){
		this.StuId=stuid;
		this.StuName=stuname;
		this.StuTypeOfCard=stutypeofcard;
		this.StuDateOfMembership=studateofmembership;
		this.issused = issused;
		
		
	}
public Student(int stuid, String stuname, String stutypeofcard,boolean issused )
{
	this.StuId=stuid;
	this.StuName=stuname;
	this.StuTypeOfCard=stutypeofcard;
	this.StuDateOfMembership= "2017";
	
	
}	


	

}

	

