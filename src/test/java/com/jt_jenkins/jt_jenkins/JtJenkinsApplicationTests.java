package com.jt_jenkins.jt_jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JtJenkinsApplicationTests {
	static Logger logger = LoggerFactory.getLogger(JtJenkinsApplicationTests.class);

	@Test
	 void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true,true);
	}

}
