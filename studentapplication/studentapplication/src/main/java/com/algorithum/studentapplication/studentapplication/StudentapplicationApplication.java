package com.algorithum.studentapplication.studentapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.algorithum.studentapplication")
public class StudentapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentapplicationApplication.class, args);
	}

}
