package com.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManagementSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "Finance", 60000));
        employees.add(new Employee(102, "Bob", "HR", 55000));
        employees.add(new Employee(103, "Charlie", "IT", 70000));
        employees.add(new Employee(104, "David", "Finance", 65000));
        employees.add(new Employee(105, "Eve", "HR", 50000));

        // Sort by salary
        System.out.println("Sorting by Salary:");
        Collections.sort(employees, new SalaryComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by name
        System.out.println("\nSorting by Name:");
        Collections.sort(employees, new NameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by department
        System.out.println("\nSorting by Department:");
        Collections.sort(employees, new DepartmentComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }


	}


