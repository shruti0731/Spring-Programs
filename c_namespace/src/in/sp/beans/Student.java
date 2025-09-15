package in.sp.beans;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	public Student(int roll,String name,int marks) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll);
		System.out.println("Marks: "+marks);	
	}
}
