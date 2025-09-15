package in.sp.beans;

public class Teacher {

	public Student stud;

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	public void TDisplay() {
		System.out.println("This is teacher method:  "+stud);
	}
}
