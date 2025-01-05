package com.jt_jenkins.jt_jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

@SpringBootApplication
public class JtJenkinsApplication {
	static Logger logger = LoggerFactory.getLogger(JtJenkinsApplication.class);
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(JtJenkinsApplication.class, args);
	}
	@PostConstruct
	private void message(){
		logger.info("Application started...");
	}
}
