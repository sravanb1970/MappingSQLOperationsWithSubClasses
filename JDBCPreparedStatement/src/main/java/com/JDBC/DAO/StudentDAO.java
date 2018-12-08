package com.JDBC.DAO;

import java.util.List;

public interface StudentDAO {

	void createStudent(Student s);
	 	Student getStudentById(int studentId);
	 	void updateStudentByEmail(String newEmail, Integer studentId);
	 	void deleteStudent(int studentId);
	 	List<Student> getAllStudents();
	 	
}
