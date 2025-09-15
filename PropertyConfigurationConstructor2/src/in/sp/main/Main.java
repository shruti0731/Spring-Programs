package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		Student a = (Student) context.getBean("std");
		a.display();
		System.out.println("---------------------------------");
		Student aa = (Student) context.getBean("std2");
		aa.display();
	}
}
