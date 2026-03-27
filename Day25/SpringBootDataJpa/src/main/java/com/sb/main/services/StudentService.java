package com.sb.main.services;

import java.util.List;

import com.sb.main.entities.Student;

public interface StudentService {

	public boolean addStudentDetails(Student std);
	public List<Student>getAllStdDetails();
	public Student getStudentDetails(long id);
	public boolean updateStdDetails(long id,float marks );
	public boolean deleteStdDetails(long id);
}
