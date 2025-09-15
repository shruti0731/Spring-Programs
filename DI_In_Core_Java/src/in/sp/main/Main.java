package in.sp.main;

import in.sp.beans.Address;
import in.sp.beans.Student;

public class Main {
	public static void main(String args[]) {
		
		Address ad = new Address();
		ad.setHouseno(754);
		ad.setCity("Sangli");
		ad.setPincode(416416);
		
		Student st = new Student();
		st.setName("Shruti");
		st.setRoll(111);
		st.setAddress(ad);
		st.display();
	}
}
