package com.bilaisheng.springboot.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: bilaisheng
 * @Date: 2019/4/24 9:02
 */
@Data
public class Student implements Serializable {

	private static final long serialVersionUID = -4132778787151045906L;

	private String sno;

	private String sname;

	private String ssex;
}
