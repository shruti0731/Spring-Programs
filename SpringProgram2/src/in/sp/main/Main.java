package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		
		//creating container - ApplicationContext
		Student s = (Student) context.getBean("stdobj1");
		s.Display();
		System.out.println("---------------------------------");
		Student ss = (Student) context.getBean("stdobj2");
		ss.Display();
	}
}
