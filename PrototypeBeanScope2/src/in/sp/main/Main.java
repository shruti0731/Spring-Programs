package in.sp.main;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		Student s1 = (Student) context.getBean("stdObj");
		System.out.println(s1);
		
		Student s2 = (Student) context.getBean("stdObj");
		System.out.println(s2);
		
		Student s3 = (Student) context.getBean("stdObj");
		System.out.println(s3);
		
//		Output - in.sp.beans.Student@366647c2
//				 in.sp.beans.Student@6a6afff2
//				 in.sp.beans.Student@1649b0e6

		
//		Here for 3 times we got the different reference_no, because we
//		used prototype scope so different objects is created.

	}
}
