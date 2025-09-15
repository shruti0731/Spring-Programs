package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
//		If I don't wanna register and refresh the class then I need to use annotation
//		with either java class or xml file.
//		context.register(Student.class);
//		context.refresh();
		Student s = (Student)context.getBean("abc");
		s.Display();
		
	}
}
