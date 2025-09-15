package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import in.sp.beans.Student;

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		Student s = (Student)context.getBean("stdbean");
		s.Display();
		
	}
}
