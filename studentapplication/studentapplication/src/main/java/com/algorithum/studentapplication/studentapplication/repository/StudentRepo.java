package com.algorithum.studentapplication.studentapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algorithum.studentapplication.studentapplication.dto.RequestDTO;
import com.algorithum.studentapplication.studentapplication.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer> {

	

	

}
