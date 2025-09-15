package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import in.sp.beans.Student;
import in.sp.resources.JavaConfigFile;

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		Student s = (Student)context.getBean("abc");
		s.display();
		
	}
}
