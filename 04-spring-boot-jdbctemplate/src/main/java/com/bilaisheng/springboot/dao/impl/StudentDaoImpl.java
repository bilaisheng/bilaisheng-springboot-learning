package com.bilaisheng.springboot.dao.impl;

import com.bilaisheng.springboot.beans.Student;
import com.bilaisheng.springboot.dao.StudentDao;
import com.bilaisheng.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * @Author: bilaisheng
 * @Date: 2019/4/24 13:55
 */
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int add(Student student) {
		String sql = "insert into student(sno,sname,ssex) values(:sno,:sname,:ssex)";
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
		return namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource(student));
	}

	@Override
	public int update(Student student) {
		String sql = "update student set sname = ? , ssex = ? where sno = ?";
		Object[] args = {student.getSname(), student.getSsex(), student.getSno()};
		int[] argsType = {Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};
		return jdbcTemplate.update(sql, args, argsType);
	}

	@Override
	public int deleteBySno(String sno) {
		String sql = "delete from student where sno = ?";
		Object[] args = {sno};
		int[] argsType = {Types.VARCHAR};
		return jdbcTemplate.update(sql, args, argsType);
	}

	@Override
	public List<Map<String, Object>> queryStudentListMap() {
		String sql = "select * from student";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public Student queryStudentBySno(String sno) {
		String sql = "select * from student where sno = ?";
		Object[] args = {sno};
		int[] argsType = {Types.VARCHAR};
		List<Student> studentList = jdbcTemplate.query(sql, args, argsType, new StudentMapper());
		if (studentList !=null && studentList.size()>0){
			return studentList.get(0);
		}else{
			return null;
		}

	}
}
