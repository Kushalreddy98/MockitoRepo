package com.oops.basic;

public class Employee {
	String employeeName;
	int employeeId;
	double salary;
	
	
	public static void main(String[] args) {
		

	Employee employee1=new Employee();
		employee1.employeeName="Manju";
		employee1.employeeId=102;
		employee1.salary=30000;
		System.out.println("Name :"+employee1.employeeName);
		System.out.println("Id :"+employee1.employeeId);
		System.out.println("Salary :"+employee1.salary);	
	}
}
