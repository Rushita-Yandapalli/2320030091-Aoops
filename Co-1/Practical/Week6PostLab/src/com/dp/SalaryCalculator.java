package com.dp;

public class SalaryCalculator {
 public double calculateSalary(Employee employee) {
	 String role = employee.getRole();
	 double salary = 0.0;
	 switch(role.toLowerCase()) {
	 case "developer" :
		 salary = 60000;
		 break;
	 case "manager":
		 salary = 80000;
		 break;
	 case "intern":
		 salary = 30000;
		 break;
		 default:
			 System.out.println("Role not recognized. Default salary applied.");
			 salary = 40000;
			 break;
	 }
	 return salary;
 }
}
