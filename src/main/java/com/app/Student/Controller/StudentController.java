package com.app.Student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Student.Service.StudentService;
import com.app.Student.entity.Student;
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/savestudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	@GetMapping("/allstudent")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();	}
	@GetMapping("student/{id}")
	public Optional<Student> getStudentById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudentById(@PathVariable int id)
	{
		studentService.deleteStudentById(id);
	}
	@PutMapping("/updatestudent/{id}")
	public Student updateStudentById(@RequestBody Student student,@PathVariable int id)
	{
		return studentService.updateStudent(student, id);
	}
	
	

}
