package com.bilaisheng.springboot;

import com.bilaisheng.springboot.beans.ConfigBean;
import com.bilaisheng.springboot.beans.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({TestConfigBean.class, ConfigBean.class})
public class Application {

	public static void main(String[] args) {
//		SpringApplication springApplication = new SpringApplication();
//		springApplication.setAddCommandLineProperties(false);
//		springApplication.run(args);
		SpringApplication.run(Application.class, args);
	}

}
