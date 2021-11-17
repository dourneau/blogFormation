package blogFormation.models;

public class Formation {
	
	private String title;
	private String program;
	private int studentNumber;
	public Formation(String title, String program, int studentNumber) {
		super();
		this.setTitle(title);
		this.setProgram(program);
		this.setStudentNumber(studentNumber);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	
	

}
