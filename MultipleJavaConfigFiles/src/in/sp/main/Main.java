package in.sp.main;
import in.sp.beans.Employee;
import in.sp.beans.Student;
import in.sp.resources.empObj;
import in.sp.resources.stdObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(stdObj.class, empObj.class);
		
		Student s = (Student) container.getBean("abc");
		s.display();
		System.out.println("---------------------------------");
		Employee ss = (Employee) container.getBean("xyz");
		ss.E_display();
	}	
}