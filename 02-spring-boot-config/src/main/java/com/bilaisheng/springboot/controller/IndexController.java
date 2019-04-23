package com.bilaisheng.springboot.controller;

import com.bilaisheng.springboot.beans.BlogBean;
import com.bilaisheng.springboot.beans.ConfigBean;
import com.bilaisheng.springboot.beans.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@Autowired
	private BlogBean blogBean;

	@Autowired
	private ConfigBean configBean;

	@Autowired
	private TestConfigBean testConfigBean;

	@RequestMapping("/test")
	private String index() {
		return testConfigBean.getName() + "\t" + testConfigBean.getAge();
	}

	@RequestMapping("/config")
	private String config() {
		return configBean.getName() + "\t" + configBean.getTitle() + "\t" + configBean.getWholeTitle();
	}

	@RequestMapping("/blog")
	private String blog() {
		return blogBean.getName() + "\t" + blogBean.getTitle();
	}


}
