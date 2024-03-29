package com.oops.basic;

public class EmpMain extends Employee {
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.employeeName="Kushal";
		employee.employeeId=101;
		employee.salary=20000;
		System.out.println("Name :"+employee.employeeName);
		System.out.println("Id :"+employee.employeeId);
		System.out.println("Salary :"+employee.salary);

}
}
