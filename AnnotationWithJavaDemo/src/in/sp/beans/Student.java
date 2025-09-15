package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//here we can also manually provide name for component i.e. abc.
//But if name isn't provided it will defaultly consider class name i.e. Student
@Component("abc")
public class Student {
	
	@Value("Shreeya")
	private String name;
	
	@Value("99")
	private int roll;
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
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+roll);
	}
}
