package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class JavaConfigFile {
	
	@Bean
	public Address createAddress() {
		Address aa=new Address();
		aa.setHouseno(77);
		aa.setCity("Jaipur");
		aa.setPincode(751862);
		return aa;
	}
	
	@Bean
	public Student createStd() {
		Student s = new Student();
		s.setRoll(77);
		s.setName("Rahi");
		s.setMarks(84);
		s.setAddress(createAddress());
		return s;
	}
}
