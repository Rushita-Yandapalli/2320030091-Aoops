package com.dp;

import java.util.Iterator;

public class EmployeeManagementSys {
	public static void main(String[] args) {
        // Creating the EmployeeList object
        EmployeeList empList = new EmployeeList();

        // Adding employees
        empList.addEmployee(new Employee("John Doe", "12/03/1990", "9876543210", 101));
        empList.addEmployee(new Employee("Jane Smith", "15/07/1985", "9876543211", 102));
        empList.addEmployee(new Employee("Mike Johnson", "23/09/1992", "9876543212", 103));

        // Iterating over the employees and displaying their details
        System.out.println("Employee List:");
        Iterator<Employee> iterator = empList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            emp.displayEmployeeDetails();
        }
        
        // Demonstrating the Cloneable interface
        try {
            Employee clonedEmployee = (Employee) empList.iterator().next().clone();
            System.out.println("\nCloned Employee Details:");
            clonedEmployee.displayEmployeeDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
