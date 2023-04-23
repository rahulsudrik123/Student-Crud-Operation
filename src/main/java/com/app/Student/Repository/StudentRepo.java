package com.app.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Student.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	

}
