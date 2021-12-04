package com.spring;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprowithjenkinsintegrationApplication {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringprowithjenkinsintegrationApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Welcome to Post COnstruct Method in Spring Boot");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringprowithjenkinsintegrationApplication.class, args);
		logger.info("Spring Boot Main Method");
	}

}
