//package com.algorithum.studentapplication.studentapplication.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.algorithum.studentapplication.studentapplication.controller.StudentController;
//import com.algorithum.studentapplication.studentapplication.entity.Student;
//import com.algorithum.studentapplication.studentapplication.repository.StudentRepo;
//
//@WebMvcTest
//public class StudentServiceImplTest {
//	
//	@MockBean
//	StudentRepo repo;
//	
//	@Autowired
//	StudentController studentController;
//	
//	@InjectMocks
//	StudentServiceImpl studentServiceImpl;
//	
//	@Autowired
//	StudentService studentService;
//	
//	@Autowired
//	MockMvc mockMvc;
//	
//	@BeforeEach
//	public void setUp() {
//		MockitoAnnotations.openMocks(this);
//		this.mockMvc = MockMvcBuilders.standaloneSetup(studentServiceImpl).build();
//	}
//	
//	
//	
//	@Test
//	public void findAllTest() {
//		List<Student> students = new ArrayList<>() ;
//		students.add(new Student(1,"Rehan",80,"IT"));
//		students.add(new Student(2,"Rehan",80,"IT"));
//		when(repo.findAll()).thenReturn(students);
//		
//		List<Student> stud = studentServiceImpl.findAll();
//		
//		assertNotNull(stud);
//		assertEquals(2, stud.size());
//		
//	}
//	
//	
//	@Test
//	public void findByIdTest() {
//		
//		Student stud = new Student(1,"abc",85,"SoftwareTest");
//		
//		when(repo.findById(1)).thenReturn(Optional.of(stud));
//		
//		Student result = studentService.findById(1);
//		
//		assertNotNull(result);
//		
//		
//	}
//	
//	
//	
//	@Test
//	public void updateTest() {
//		Student existStud = new Student(1,"raj",75,"IT");
//		Student updateStud = new Student(1,"raj",75,"CEO");
//		
//		when(repo.save(any(Student.class))).thenReturn(existStud);
//		
//		studentService.update(updateStud);
//		
//		assertNotNull(updateStud);
//		assertNotEquals(existStud, updateStud);
//		
//	}
//	
//	
//	@Test
//	public void deleteTest() {
//		Student student = new Student(1,"abc",74,"IT");
//		studentService.delete(student);
//		
//		assertNotNull(student);
//	}
//	
//
//}
