package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//here we can also manually provide name for component i.e. abc.
//But if name isn't provided it will defaultly consider class name i.e. Student
@Component
public class Student {
	
	
	private String name;
	private int roll;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subjects subjects;
	
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	
	public void Display() {
		System.out.println("Subjects: "+subjects);
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+roll);
		System.out.println("Address: "+address);
		
	}
}
