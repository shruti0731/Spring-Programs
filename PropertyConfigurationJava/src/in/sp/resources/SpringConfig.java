package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Student createBean() {
		Student s =new Student();
		s.setName("Rahi");
		s.setRoll(1346);
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("React");
		list.add("Data science");
		s.setSubjects(list);
		return s;
	}
}
