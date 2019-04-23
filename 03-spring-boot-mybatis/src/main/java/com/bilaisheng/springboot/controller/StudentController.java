package com.bilaisheng.springboot.controller;

import com.bilaisheng.springboot.beans.Student;
import com.bilaisheng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/query")
	public Student queryStudentBySno(){
		return studentService.queryBySno("001");
	}
}
