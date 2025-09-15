package in.sp.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("C++", 99);
		mp.put("English", 98);
		mp.put("Android", 97);
		s.setSubjects(mp);
		return s;
	}
}
