package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Employee;

@Configuration
public class empObj {
	
	@Bean(name="xyz")
	public Employee createBean() {
		Employee e = new Employee();
		e.setEmpid(777);
		e.setEmpnm("Shruti");
		return e;
	}
}
