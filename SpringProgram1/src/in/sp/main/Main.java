package in.sp.main;
import org.springframework.core.io.Resource;

import in.sp.beans.Student;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Main {
	public static void main(String args[]) {
		
		Resource rec = new ClassPathResource("/in/sp/resources/applicationContext.xml");
		
		//creating container - beanFactory
		BeanFactory container = new XmlBeanFactory(rec);
		Student s = (Student) container.getBean("stdobj");
		s.display();
	}	
}