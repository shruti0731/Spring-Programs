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
		
//		Output - in.sp.beans.Student@770d3326
//				 in.sp.beans.Student@770d3326
//				 in.sp.beans.Student@770d3326
		
//		Here for 3 times we got the same reference_no, because by defaultly it is 
//		assigned singleton scope so only one object is created.
//		Initially 'stdObj' object is created in cache memory and all s1,s2
//		and s3 are referencing to it.
	}
}
