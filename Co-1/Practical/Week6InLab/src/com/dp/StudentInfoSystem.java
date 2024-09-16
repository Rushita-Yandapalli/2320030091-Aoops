package com.dp;

public class StudentInfoSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager studentManager = new StudentService();
		CourseManager courseManager = new CourseService(studentManager);
		
		Student student1 = new Student("1", "Alice");
		Student student2 = new Student("2", "Bob");
		studentManager.addStudent(student1);
		studentManager.addStudent(student2);
		
		Course course1 = new Course("101", "Mathematics");
		Course course2 = new Course("102", "Computer Science");
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		courseManager.enrollStudentInCourse("1","101");
		courseManager.enrollStudentInCourse("2", "102");
		
		System.out.println("Students enrolled in Mathematics:");
		for(Student student : courseManager.getEnrolledStudents("101")) {
			System.out.println(student.getName());
		}
		System.out.println("Students enrolled in Computer Science:");
		for(Student student : courseManager.getEnrolledStudents("102")) {
			System.out.println(student.getName());
		}
				

	}

}
