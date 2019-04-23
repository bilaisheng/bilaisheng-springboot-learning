package com.bilaisheng.springboot.mapper;


import com.bilaisheng.springboot.beans.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {

	@Insert("insert into student(sno,sname,ssex) values(#{sno},#{name},#{sex})")
	int add(Student student);

	@Update("update student set sname=#{sname}, ssex=#{sex} where sno = #{sno}")
	int update(Student student);

	@Delete("delete student where sno = #{sno}")
	int deleteBySno(String sno);

	@Select("select * from student where sno = #{sno}")
	@Results(id = "student", value = {
		@Result(property = "sno", column = "sno", javaType = String.class),
		@Result(property = "sname", column = "sname", javaType = String.class),
		@Result(property = "ssex", column = "ssex", javaType = String.class)
	})
	Student queryBySno(String sno);


}
