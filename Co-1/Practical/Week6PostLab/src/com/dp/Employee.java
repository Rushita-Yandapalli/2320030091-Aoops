package com.dp;

public class Employee {
private String name;
private String role;
public Employee(String name, String role) {
	this.name = name;
	this.role = role;
}
public String getName() {
	return name;
}
public String getRole() {
	return role;
}
public void displayEmployeeInfo() {
	System.out.println("Employee Name:" + name);
	System.out.println("Employee Role:" + role);
}
}
