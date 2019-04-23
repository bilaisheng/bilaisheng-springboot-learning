package com.bilaisheng.springboot.service;

import com.bilaisheng.springboot.beans.Student;

public interface StudentService {

	int add(Student student);

	int update(Student student);

	int deleteBySno(String sno);

	Student queryBySno(String sno);
}
