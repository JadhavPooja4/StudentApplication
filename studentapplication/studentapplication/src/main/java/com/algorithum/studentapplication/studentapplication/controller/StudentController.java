package com.algorithum.studentapplication.studentapplication.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algorithum.studentapplication.studentapplication.dto.RequestDTO;
import com.algorithum.studentapplication.studentapplication.dto.ResponseDTO;
import com.algorithum.studentapplication.studentapplication.entity.Student;
import com.algorithum.studentapplication.studentapplication.repository.StudentRepo;
import com.algorithum.studentapplication.studentapplication.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	//RetriveData
	@GetMapping("/students")
	public ResponseEntity<ResponseDTO> retriveStudent(){
		List<Student> studentList =  studentService.getStudent();
		Map<String,List<Student>> attribute = new HashMap<>();
		attribute.put("StudentList", studentList);
		
		ResponseDTO response = new ResponseDTO();
		response.setResponseAttribute(attribute);
		System.out.println("list of sudent: "+studentList);
		return  ResponseEntity.ok(response);
	}

	//Create new Student
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createStudent(@RequestBody RequestDTO requestDTO){
		System.err.println("result: "+requestDTO);
		ResponseDTO responseDTO = studentService.createStudent(requestDTO);
		return new ResponseEntity<> (responseDTO,HttpStatus.CREATED);
		
	}
	
	//update Student
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateStudent(@RequestBody RequestDTO requestDTO){
		ResponseDTO responseDTO = studentService.updateStudent(requestDTO);
		return ResponseEntity.ok(responseDTO);
		
	}
	
	//Delete Student
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseDTO> deleteStudent(@RequestBody RequestDTO requestDTO){
		ResponseDTO responseDTO = studentService.deleteStudent(requestDTO);
		return ResponseEntity.ok(responseDTO);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//To Get All The Student
//	@GetMapping("/students")
//	public List<Student> getAllStudent(){
//		List<Student> students = studentService.findAll();
//		return students;
//	}
//	//To Get Particular Student
//	
//	@GetMapping("/students/{id}")
//	public Student getStudent(@PathVariable int id) {
//		Student student = studentService.findById(id);
//		return student;
//	}
//	//To Create a New Student
//	
//	@PostMapping("/students/add")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public void createStudent(@RequestBody Student student) {
//		studentService.save(student);
//	}
//	//To Update the Student
//	
//	@PutMapping("/students/update")
//	public Student updateStudents(@RequestBody Student student) {
//		Student studentUpdate = studentService.update(student);
//		return studentUpdate;
//	}
//	// To Delete The Student
//	
//	@DeleteMapping("/students/delete/{id}")
//	public void deleteStudent(@PathVariable int id) {
//		Student student = studentService.findById(id);
//		studentService.delete(student);
//	}
//	
	
	
	

}
