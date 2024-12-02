package com.algorithum.studentapplication.studentapplication.service;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algorithum.studentapplication.studentapplication.dto.RequestDTO;
import com.algorithum.studentapplication.studentapplication.dto.ResponseDTO;
import com.algorithum.studentapplication.studentapplication.entity.Student;
import com.algorithum.studentapplication.studentapplication.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo repo;
	
	//Get All Student
	@Override
	public List<Student> getStudent() {
		List<Student> studentList = repo.findAll();
		return studentList;
	}
	
	
	//Create Student
	@Override
	public ResponseDTO createStudent(RequestDTO requestDTO) {
		Map<String, ?> requestAtrributes = requestDTO.getRequest();
		
		
		
		String studentName = (String) requestAtrributes.get("name");
		
		float studentPercentage = (float) requestAtrributes.get("percentage");
		 
		String studentBranch = (String) requestAtrributes.get("branch");
		
		Student student = new Student();
		
		student.setName(studentName);
		student.setPercentage(studentPercentage);
		student.setBranch(studentBranch);
		
		
		Student saveStudent = repo.save(student);
	
		ResponseDTO responseDTO = new ResponseDTO();
		Map <String,Student> map = new HashMap<>();
		map.put("Student",saveStudent );
		responseDTO.setResponseAttribute(map);

		
		return responseDTO;
			
	}
	
	
	//Update Student
	@Override
	public ResponseDTO updateStudent(RequestDTO requestDTO) {
		
		Map<String,?> update = requestDTO.getRequest();
		
		Map<String, Object> student = (Map<String, Object>) requestDTO.getRequest();
		if (student==null) {
			throw new RuntimeException("Student Not Found");
		}
		update.forEach((key,value) -> {
			if(student.containsKey(key)) {
				student.put(key, value);
			}
		});
		ResponseDTO dto=new ResponseDTO();
		dto.setResponseAttribute("update success");
		return dto;
	}

	
	//Delete Student
	@Override
	public void deleteStudent(int id, RequestDTO requestDTO) {
		
		if (!repo.existsById(id)) {
			throw new RuntimeException("Student not found with id: "+id);
		}
		repo.deleteById(id);
		
		
		
		
	}



	
	
	
	
	

	@Override
	public ResponseDTO deleteStudent(RequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}


	


	


	

//	@Override
//	public ResponseDTO updateStudent(RequestDTO requestDTO) {
//		Optional<RequestDTO> studOptional = repo.findById(requestDTO.getId());
//		if(studOptional.isEmpty()) {
//			return null;
//		}else {
//			RequestDTO request = studOptional.get();
//			request.
//		}
//			
//		return null;
//	}
//
//	@Override
//	public ResponseDTO deleteStudent(RequestDTO requestDTO) {
//		repo.delete();
//		
//		return null;
//	}
	
	
	
	


	
	
	
//	//To display all Students
//	@Override
//	public List<Student> findAll() {
//		List<Student> studentList = repo.findAll();
//		return studentList;
//	}
//	//To display particular student
//	@Override
//	public Student findById(int id) {
//		Optional<Student> stuOptional = repo.findById(id);
//		if(stuOptional.isEmpty()) {
//			return null;
//		}else {
//			return stuOptional.get();
//		}
//		
//	}
//	//To create new Student
//	
//	@Override
//	public void save(Student student) {
//		repo.save(student);
//		
//	}
//	
//	//To update Student
//	
//	@Override
//	public Student update(Student student) {
//		Optional<Student> stuOptional = repo.findById(student.getId());
//		if(stuOptional.isEmpty()) {
//			return null;
//		}else {
//			Student student2 = stuOptional.get();
//			student2.setName(student.getName());
//			student2.setPercentage(student.getPercentage());
//			student2.setBranch(student.getBranch());
//			repo.save(student2);
//			return student2;
//		}
//		
//	}
//	
//    //To delete Student
//	
//	@Override
//	public void delete(Student student) {
//		repo.delete(student);
//	}

	


	
	
	

	

}
