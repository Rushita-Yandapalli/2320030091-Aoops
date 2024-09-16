package com.dp;

import java.util.ArrayList;
import java.util.List;

public class Course {
	 private String courseId;
	    private String courseName;
	    private List<Student> enrolledStudents;

	    public Course(String courseId, String courseName) {
	        this.courseId = courseId;
	        this.courseName = courseName;
	        this.enrolledStudents = new ArrayList<>();
	    }

	    // Getters and Setters
	    public String getCourseId() {
	        return courseId;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public List<Student> getEnrolledStudents() {
	        return enrolledStudents;
	    }

	    public void enrollStudent(Student student) {
	        enrolledStudents.add(student);
	    }
	}


