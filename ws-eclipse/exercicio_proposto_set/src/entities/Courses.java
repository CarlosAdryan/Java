package entities;

public class Courses {
	
	private int coursea;
	private int courseb;
	private int coursec;
	
	public Courses(int coursea, int courseb, int coursec) {
		this.coursea = coursea;
		this.courseb = courseb;
		this.coursec = coursec;
	}
	public int getCoursea() {
		return coursea;
	}
	public void setCoursea(int coursea) {
		this.coursea = coursea;
	}
	public int getCourseb() {
		return courseb;
	}
	public void setCourseb(int courseb) {
		this.courseb = courseb;
	}
	public int getCoursec() {
		return coursec;
	}
	public void setCoursec(int coursec) {
		this.coursec = coursec;
	}
	public int sum() {
		return coursea + courseb + coursea;
	}
	
	

}
