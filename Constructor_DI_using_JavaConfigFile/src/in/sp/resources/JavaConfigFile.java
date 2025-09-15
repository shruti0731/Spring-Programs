package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class JavaConfigFile {
	
	@Bean
	public Address createAddress() {
		Address aa=new Address(77,"jaipur",456789);

		return aa;
	}
	
	@Bean
	public Student createStd() {
		return new Student(55,"Rahi",84,createAddress());

	}
}
