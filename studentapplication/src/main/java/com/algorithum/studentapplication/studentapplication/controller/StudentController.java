package com.algorithum.studentapplication.studentapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algorithum.studentapplication.studentapplication.entity.Student;
import com.algorithum.studentapplication.studentapplication.repository.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	//To Get All The Student
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		List<Student> students = repo.findAll();
		return students;
	}
	
	//To Get Particular Student
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		return student;
	}
	
	
	//To Create a New Student
	@PostMapping("/students/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@PutMapping("/students/update/{id}")
	public Student updateStudents(@PathVariable int id) {
		Student student = repo.findById(id).get();
		student.setName("Poonam");
		student.setPercentage(92);
		return student;
	}
	
	@DeleteMapping("/students/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}
	
	

}
