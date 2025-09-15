package in.sp.beans;

import java.util.List;

public class Student {
	
	private String name;
	private int roll;
	private List<String> subjects;
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void Display() 
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Address: "+address);
		System.out.println("Subjects: "+subjects);
	}
}
