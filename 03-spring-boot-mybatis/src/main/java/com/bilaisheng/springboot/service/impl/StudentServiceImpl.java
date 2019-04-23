package com.bilaisheng.springboot.service.impl;

import com.bilaisheng.springboot.beans.Student;
import com.bilaisheng.springboot.mapper.StudentMapper;
import com.bilaisheng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public int add(Student student) {
		return studentMapper.add(student);
	}

	@Override
	public int update(Student student) {
		return studentMapper.update(student);
	}

	@Override
	public int deleteBySno(String sno) {
		return studentMapper.deleteBySno(sno);
	}

	@Override
	public Student queryBySno(String sno) {
		return studentMapper.queryBySno(sno);
	}
}
