package com.dp;

public class EmployeeManagementSystem {
	public static void main(String args[]) {
		Employee emp1 = new Employee("Alice", "Developer");
		Employee emp2 = new Employee("Bob", "Manager");
		Employee emp3 = new Employee("Charlie", "Intern");
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		emp1.displayEmployeeInfo();
		System.out.println("Salary : $" + salaryCalculator.calculateSalary(emp1) + "\n");
		emp2.displayEmployeeInfo();
        System.out.println("Salary: $" + salaryCalculator.calculateSalary(emp2) + "\n");

        emp3.displayEmployeeInfo();
        System.out.println("Salary: $" + salaryCalculator.calculateSalary(emp3) + "\n");
	}

}
