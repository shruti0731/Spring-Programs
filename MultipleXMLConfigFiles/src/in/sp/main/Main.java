package in.sp.main;
import in.sp.beans.Employee;
import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/sp/resources/studappContext.xml", "/in/sp/resources/empappContext.xml");
		
		Student s = (Student) container.getBean("stdobj");
		s.display();
		System.out.println("---------------------------------");
		Employee ss = (Employee) container.getBean("empobj");
		ss.E_display();
	}	
}