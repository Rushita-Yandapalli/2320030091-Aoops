package com.dp;
import java.util.*;

public class StudentGrades {
	private Map<Integer, Set<Integer>> studentGrades;

    // Constructor
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a student's grade
    public void addGrade(int studentID, int grade) {
        // Check if student already exists in the map
        if (!studentGrades.containsKey(studentID)) {
            // If not, create a new HashSet to store grades
            studentGrades.put(studentID, new HashSet<>());
        }
        // Add the grade to the student's grade set
        studentGrades.get(studentID).add(grade);
        System.out.println("Grade " + grade + " added for student ID " + studentID);
    }

    // Method to retrieve grades of a student
    public Set<Integer> getGrades(int studentID) {
        // Check if the student exists in the map
        if (studentGrades.containsKey(studentID)) {
            return studentGrades.get(studentID);
        } else {
            System.out.println("Student ID " + studentID + " not found.");
            return new HashSet<>();
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();

        // Adding grades for students
        sg.addGrade(101, 85);
        sg.addGrade(101, 90);
        sg.addGrade(102, 75);
        sg.addGrade(102, 80);
        sg.addGrade(101, 85); // Duplicate grade, will not be added

        // Retrieving and printing grades for student 101
        System.out.println("Grades for student 101: " + sg.getGrades(101));
        // Retrieving and printing grades for student 102
        System.out.println("Grades for student 102: " + sg.getGrades(102));
    }
}


