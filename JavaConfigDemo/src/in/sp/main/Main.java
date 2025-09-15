package in.sp.main;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.beans.Student;
import in.sp.resources.SpringConfig;

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student s = (Student) context.getBean("shru");
		s.Display();
		System.out.println("--------------------------");
		Student ss = (Student) context.getBean("stdobj");
		ss.Display();
	}
}
