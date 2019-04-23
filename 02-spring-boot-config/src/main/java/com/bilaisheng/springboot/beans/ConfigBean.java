package com.bilaisheng.springboot.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "blog")
@Data
public class ConfigBean {

	private String name;

	private String title;

	private String wholeTitle;
}
