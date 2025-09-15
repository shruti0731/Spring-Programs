package in.sp.main;

import in.sp.beans.Student;
import in.sp.resources.JavaConfigFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String []args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		Student s = (Student) context.getBean("createStd");
		s.display();
	}
}
