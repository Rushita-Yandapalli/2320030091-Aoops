package com.dp;

import java.util.List;

public interface CourseManager {
	void addCourse(Course course);
    void enrollStudentInCourse(String studentId, String courseId);
    List<Student> getEnrolledStudents(String courseId);
}
