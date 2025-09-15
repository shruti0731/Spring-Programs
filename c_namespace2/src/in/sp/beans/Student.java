package in.sp.beans;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private Address address;
	
	public Student(int roll,String name,int marks,Address address) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll);
		System.out.println("Marks: "+marks);	
		System.out.println("Address: "+address);
	}
}
