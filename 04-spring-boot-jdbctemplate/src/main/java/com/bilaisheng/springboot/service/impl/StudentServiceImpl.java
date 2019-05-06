package com.bilaisheng.springboot.service.impl;

import com.bilaisheng.springboot.beans.Student;
import com.bilaisheng.springboot.dao.StudentDao;
import com.bilaisheng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: bilaisheng
 * @Date: 2019/4/24 9:06
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public int add(Student student) {
		return this.studentDao.add(student);
	}

	@Override
	public int update(Student student) {
		return this.studentDao.update(student);
	}

	@Override
	public int deleteBySno(String sno) {
		return this.studentDao.deleteBySno(sno);
	}

	@Override
	public List<Map<String, Object>> queryStudentListMap() {
		return this.studentDao.queryStudentListMap();
	}

	@Override
	public Student queryStudentBySno(String sno) {
		return this.studentDao.queryStudentBySno(sno);
	}
}
