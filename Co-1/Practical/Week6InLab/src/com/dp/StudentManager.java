package com.dp;

public interface StudentManager {
	void addStudent(Student student);
    void removeStudent(String studentId);
    Student getStudent(String studentId);
}
