package com.bilaisheng.springboot.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

	private static final long serialVersionUID = 734649182705019598L;

	private String sno;

	private String sname;

	private String ssex;

}
