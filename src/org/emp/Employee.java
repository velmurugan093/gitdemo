package org.emp;

public class Employee extends Company {
	public void empId() {
		// TODO Auto-generated method stub
		System.out.println("emp id");
	}

	public void empName() {
		System.out.println("emp name");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.compAddr();
		emp.compName();
		emp.cliId();
		emp.cliName();
	}

}
