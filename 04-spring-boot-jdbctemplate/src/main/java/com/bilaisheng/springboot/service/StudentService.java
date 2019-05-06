package com.bilaisheng.springboot.service;

import com.bilaisheng.springboot.beans.Student;

import java.util.List;
import java.util.Map;

/**
 * @Author: bilaisheng
 * @Date: 2019/4/24 9:03
 */
public interface StudentService {

	int add(Student student);

	int update(Student student);

	int deleteBySno(String sno);

	List<Map<String, Object>> queryStudentListMap();

	Student queryStudentBySno(String sno);
}
