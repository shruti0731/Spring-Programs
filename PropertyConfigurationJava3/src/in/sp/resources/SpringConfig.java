package in.sp.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import in.sp.beans.Student;

@Configuration
@PropertySource("/in/sp/resources/student.properties")
public class SpringConfig {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.roll}")
	private int roll;
	
	@Bean
	public Student createBean() {
		Student s =new Student();
		s.setName(name);
		s.setRoll(roll);
		return s;
	}
}
