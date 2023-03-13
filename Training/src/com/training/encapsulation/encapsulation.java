package com.training.encapsulation;

class Employee {

	private Integer empid;
	private String empname;

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
}

public class encapsulation {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmpid(101);
		employee.setEmpname("Masum");
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpname());

	}

}
