package com.app.Student.Service;

import java.util.List;
import java.util.Optional;

import com.app.Student.entity.Student;


public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public Optional<Student> getStudentById(int id);
	public void deleteStudentById(int id);
	public Student updateStudent(Student student, int id);
	
	

}
