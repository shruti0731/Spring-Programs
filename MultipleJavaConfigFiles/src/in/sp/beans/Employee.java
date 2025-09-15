package in.sp.beans;

public class Employee {
	private String empnm;
	private int empid;
	public String getEmpnm() {
		return empnm;
	}
	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void E_display() {
		System.out.println("Employee Name: "+empnm);
		System.out.println("Employee ID: "+empid);
	}
}
