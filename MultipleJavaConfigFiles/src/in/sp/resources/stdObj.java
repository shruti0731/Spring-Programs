package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class stdObj {
	
	@Bean(name="abc")
	public Student createBean() {
		
		Student std = new Student();
		std.setName("Rahi");
		std.setRoll(1245);
		return std;
	}
}
