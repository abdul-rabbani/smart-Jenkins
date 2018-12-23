package com.smart.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartJenkinsApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(SmartJenkinsApplication.class);

	public static void main(String[] args) {
		LOG.info("appinit");
		SpringApplication.run(SmartJenkinsApplication.class, args);
	}

}

