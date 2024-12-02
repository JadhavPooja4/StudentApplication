package com.algorithum.studentapplication.studentapplication.service;

import java.util.List;

import com.algorithum.studentapplication.studentapplication.dto.RequestDTO;
import com.algorithum.studentapplication.studentapplication.dto.ResponseDTO;
import com.algorithum.studentapplication.studentapplication.entity.Student;

public interface StudentService{
	
	
//	List<Student> getStudent();

	ResponseDTO createStudent(RequestDTO requestDTO);

	ResponseDTO deleteStudent(RequestDTO requestDTO);

	void deleteStudent(int id, RequestDTO requestDTO);

	ResponseDTO updateStudent(RequestDTO requestDTO);

	List<Student> getStudent();



	
	

//	List<Student> findAll();
//
//	Student findById(int id);
//
//	void save(Student student);
//
//	void delete(Student student);
//
//	Student update(Student student);

	

	

}
