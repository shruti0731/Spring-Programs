package in.sp.beans;

public class Student {
	private int roll;
	private String name;
	private Address address;
	
	public Student(int roll,String name,Address address)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	
	public void display() {
		System.out.println("Roll no. "+roll);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
