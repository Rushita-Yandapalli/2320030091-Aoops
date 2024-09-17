package com.dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList implements Iterable<Employee>{
	private List<Employee> employeeList;

    // Constructor
    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    // Add an employee to the list
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		 return employeeList.iterator();
	}
	

}
