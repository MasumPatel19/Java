package com.training.collection;

class Employee {
	int empId;
	String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
}

public class tostringMethodExample {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "XYZ");
		System.out.println(emp);
	}

}
