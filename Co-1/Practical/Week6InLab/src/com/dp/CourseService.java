package com.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseService implements CourseManager{
private Map<String, Course> courses = new HashMap<>();
private StudentManager studentManager;

public CourseService(StudentManager studentManager) {
	this.studentManager = studentManager;
}
	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		courses.put(course.getCourseId(), course);
		
	}

	@Override
	public void enrollStudentInCourse(String studentId, String courseId) {
		// TODO Auto-generated method stub
		Course course = courses.get(courseId);
		Student student = studentManager.getStudent(studentId);
		if(course != null && student !=null) {
			course.enrollStudent(student);;
			student.enrollInCourses(course);
		}
		
	}

	@Override
	public List<Student> getEnrolledStudents(String courseId) {
		// TODO Auto-generated method stub
		Course course = courses.get(courseId);
		if(course != null) {
			return course.getEnrolledStudents();
		}
		return new ArrayList<>();
	}

}
