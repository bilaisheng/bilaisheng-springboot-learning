package com.bilaisheng.springboot.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class BlogBean {

	@Value("${blog.name}")
	private String name;

	@Value("${blog.title}")
	private String title;
}
