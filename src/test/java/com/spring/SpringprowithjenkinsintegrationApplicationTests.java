package com.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringprowithjenkinsintegrationApplicationTests {
	
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(SpringprowithjenkinsintegrationApplication.class);

	@Test
	void contextLoads() {
		logger.info("in test method of spring boot class");
		assertEquals(true, true);
	}

}
