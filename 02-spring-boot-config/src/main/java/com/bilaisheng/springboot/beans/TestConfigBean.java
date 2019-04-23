package com.bilaisheng.springboot.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:test.properties")
@Component
@Data
public class TestConfigBean {

	private String name;

	private Integer age;
}
