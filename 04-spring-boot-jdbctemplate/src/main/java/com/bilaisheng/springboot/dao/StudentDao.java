package com.bilaisheng.springboot.dao;

import com.bilaisheng.springboot.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: bilaisheng
 * @Date: 2019/4/24 9:08
 */
public interface StudentDao {

	int add(Student student);

	int update(Student student);

	int deleteBySno(String sno);

	List<Map<String, Object>> queryStudentListMap();

	Student queryStudentBySno(String sno);
}
