package in.sp.beans;

public class Student {
	private int roll;
	private String name;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Roll no. "+roll);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
