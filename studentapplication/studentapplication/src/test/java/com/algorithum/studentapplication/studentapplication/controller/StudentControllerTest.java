//package com.algorithum.studentapplication.studentapplication.controller;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.algorithum.studentapplication.studentapplication.entity.Student;
//import com.algorithum.studentapplication.studentapplication.service.StudentService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@WebMvcTest
////@SpringBootTest
//public class StudentControllerTest {
//	
//	@MockBean
//	private StudentService studentService;
//	
//	@InjectMocks
//	StudentController studentController;
//	
//	@Autowired
//	MockMvc mockMvc;
//	
//	@Autowired
//	ObjectMapper objectMapper;
//	
//	@BeforeEach
//	
//	public void setUp() {
//		MockitoAnnotations.openMocks(this);
//		this.mockMvc=MockMvcBuilders.standaloneSetup(studentController).build();
//	}
//	
//	@Test
//	public void getAllStudentTest() throws Exception {
//		List<Student> student= new ArrayList<>();
//		student.add(new Student(1, "raj", 80.0f, "IT"));
//		student.add(new Student(2, "raj", 80.0f, "IT"));
//		when(studentService.findAll()).thenReturn(student);
//		
//		MvcResult result = mockMvc.perform(get("/students")).andReturn();
//		String response = result.getResponse().getContentAsString();
////		System.err.println("result: "+response);
//		
//		
//		assert(response!=null);
//		
//		assertNotNull(response);
//	
//	}
//		
//	
//	
//	@Test
//	public void getStudentTest() throws Exception{
//		
//		int studentId=1;
//		Student student = new Student();
//		student.setId(1);
//		student.setName("abc");
//		student.setPercentage(71);
//		student.setBranch("IT");
//		when(studentService.findById(studentId)).thenReturn(student);
//		
//		MvcResult result = mockMvc.perform(get("/students/{id}",studentId)).andReturn();
//		String string = result.getResponse().getContentAsString();
////		System.err.println("result: "+string);
//		
//		Student student2 = objectMapper.readValue(string, Student.class);
//		assertNotNull(student2);
//		assertNotNull(student2.getId());
//		
//		
//		
//	}
//	
//	
//	@Test
//	public void updateStudentTest()throws Exception {
//		int studentId=2;
//		Student student = new Student();
//		student.setId(studentId);
//		student.setName("Rohan");
//		student.setPercentage(94);
//		student.setBranch("Maneger");
//		when(studentService.update(any(Student.class))).thenReturn(student);
//		
//		MvcResult result = mockMvc.perform(get("/students/update",studentId)).andReturn();
//
//		
//		assertNotNull(result);
//		
//	}
//	
//	
//	@Test
//	public void deleteStudentTest() throws Exception {
//		Student studentId = null ;
//		Mockito.doNothing().when(studentService).delete(studentId);
//		
//		MvcResult result = mockMvc.perform(get("/students/delete/{id}",studentId)).andReturn();
//		String strings = result.getResponse().getContentAsString();
//		
//		assertNotNull(strings);
//		
//
//		
//	}
//
//
//	
//
//}
