package com.dp;

import java.util.HashMap;
import java.util.Map;

public class StudentService implements StudentManager {
private Map<String, Student> students = new HashMap<>();


@Override
public void addStudent(Student student) {
	// TODO Auto-generated method stub
	students.put(student.getId(), student);
}

@Override
public void removeStudent(String studentId) {
	// TODO Auto-generated method stub
	students.remove(studentId);
}

@Override
public Student getStudent(String studentId) {
	// TODO Auto-generated method stub
	return students.get(studentId);
}}
