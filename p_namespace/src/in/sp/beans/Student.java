package in.sp.beans;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll);
		System.out.println("Marks: "+marks);	
	}
}
