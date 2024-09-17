package com.dp;

public class Student implements Cloneable{
	
	private String name;
    private int rollNumber;
    private int marks;

    // Constructor
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    // Overriding the clone() method from the Object class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            // Creating a student object
            Student student1 = new Student("John Doe", 101, 85);

            // Cloning the student1 object
            Student student2 = (Student) student1.clone();

            // Display information of original and cloned object
            System.out.println("Original Student:");
            student1.displayInfo();

            System.out.println("\nCloned Student:");
            student2.displayInfo();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

