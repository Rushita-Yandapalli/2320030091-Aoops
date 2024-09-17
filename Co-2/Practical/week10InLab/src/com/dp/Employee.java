package com.dp;


public class Employee implements Cloneable{
	private String name;
    private String dob; // Date of Birth (format: DD/MM/YYYY)
    private String mobileNumber;
    private int id;
    
    // Constructor
    public Employee(String name, String dob, String mobileNumber, int id) {
        this.name = name;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getId() {
        return id;
    }

    // Overriding the clone() method to support cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", DOB: " + dob + ", Mobile: " + mobileNumber);
    }
}

	


