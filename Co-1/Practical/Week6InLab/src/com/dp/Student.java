package com.dp;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String id;
    private String name;
    private List<Course> enrolledCourses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public List<Course> getEnrolledCourses(){
	return enrolledCourses;
}
public void enrollInCourses(Course course) {
	enrolledCourses.add(course);
}
}

