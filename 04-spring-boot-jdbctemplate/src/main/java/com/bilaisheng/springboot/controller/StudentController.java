package com.bilaisheng.springboot.controller;

import com.bilaisheng.springboot.beans.Student;
import com.bilaisheng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: bilaisheng
 * @Date: 2019/4/24 9:03
 */
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/add")
	public int add(String sno, String sname, String ssex) {
		Student student = new Student();
		student.setSno(sno);
		student.setSname(sname);
		student.setSsex(ssex);
		return studentService.add(student);
	}

	@RequestMapping("/update")
	public int update(String sno, String sname, String ssex) {
		Student student = new Student();
		student.setSno(sno);
		student.setSname(sname);
		student.setSsex(ssex);
		return studentService.update(student);
	}

	@RequestMapping("/delete")
	public int deleteBySno(String sno) {
		return studentService.deleteBySno(sno);
	}

	@RequestMapping("/queryAll")
	public List<Map<String, Object>> queryStudentListMap() {
		return studentService.queryStudentListMap();
	}

	@RequestMapping("/query")
	public Student queryStudentBySno(String sno) {
		return studentService.queryStudentBySno(sno);
	}

}
