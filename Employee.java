package com.practice.program;

public class Employee {

	String company="TechnoElevate";
	String empName ="Vinod";
	String role ="FullStackDeveloper";
	
	public static void main(String[] args) {
		
		System.out.println("Employee details :");
		
		Employee emp =new Employee();
		System.out.println("Company : "+emp.company);
		System.out.println("Name : "+emp.empName);
		System.out.println("Role : "+emp.role);
		
	}
}
