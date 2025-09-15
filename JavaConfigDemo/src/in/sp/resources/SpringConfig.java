package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean(name = "shru")
	public Student createBean1() {
		Student std = new Student();
		std.setName("Shruti");
		std.setRoll(2);
		return std;
	}
	
	@Bean(name = "stdobj")
	public Student createBean2() {
		Student std = new Student();
		std.setName("Prerana");
		std.setRoll(3);
		return std;
	}
}
