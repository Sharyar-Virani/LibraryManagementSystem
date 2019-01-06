
public class Teacher {


	public int teachId=101;
	public int  teachPass=1234;
	
	private int  TeachId;
	private String TeachName;
    private	String TeachTypeOfCard;
	private String TeachDateOfMembership;
	
	
	
	
	public Teacher(int teachId, String teachName, String teachTypeOfCard, String teachDateOfMembership) {
	
		TeachId = teachId;
		TeachName = teachName;
		TeachTypeOfCard = teachTypeOfCard;
		TeachDateOfMembership = teachDateOfMembership;
	}

	public int getTeachId() {
		return teachId;
	}

	public void setTeachId(int teachId) {
		this.teachId = teachId;
	}

	public int getTeachPass() {
		return teachPass;
	}

	public void setTeachPass(int teachPass) {
		this.teachPass = teachPass;
	}

	public int getTeacId() {
		return TeachId;
	}

	public void setTeacId(int teacId) {
		TeachId = teacId;
	}

	public String getTeachName() {
		return TeachName;
	}

	public void setTeachName(String teachName) {
		TeachName = teachName;
	}

	public String getTeachTypeOfCard() {
		return TeachTypeOfCard;
	}

	public void setTeachTypeOfCard(String teachTypeOfCard) {
		TeachTypeOfCard = teachTypeOfCard;
	}

	public String getTeachDateOfMembership() {
		return TeachDateOfMembership;
	}

	public void setTeachDateOfMembership(String teachDateOfMembership) {
		TeachDateOfMembership = teachDateOfMembership;
	}

	public int getStuPass() {
		return teachPass;
	}

	public int getStudentId() {
		return teachId;
	}
	
}
