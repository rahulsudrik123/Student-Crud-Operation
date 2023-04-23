package com.app.Student.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Student.Repository.StudentRepo;
import com.app.Student.Service.StudentService;
import com.app.Student.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	 private StudentRepo studentRepo;
	
	@Override
	public Student saveStudent(Student student)
	{
		return studentRepo.save(student);
	}
	@Override
	public List<Student> getAllStudent()
	{
		return studentRepo.findAll();	
	}
	@Override
	public Optional<Student> getStudentById(int id)
	{
		return studentRepo.findById(id);
	}
	@Override
	public void deleteStudentById(int id)
	{
		 studentRepo.deleteById(id);
	}
	@Override
	public Student updateStudent(Student student, int id)
	{
		Optional<Student> stud = studentRepo.findById(id);
		stud.get().setId(student.getId());
		stud.get().setName(student.getName());
		stud.get().setAge(student.getAge());
		stud.get().setCollegeName(student.getCollegeName());
		return studentRepo.save(stud.get());
		
	}
	
	

}
