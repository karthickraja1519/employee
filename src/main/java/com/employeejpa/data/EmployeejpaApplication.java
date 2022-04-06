package com.employeejpa.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netflix.discovery.shared.Application;




@SpringBootApplication
//@EnableDiscoveryClient
public class EmployeejpaApplication {

	private static final Logger LOGGER = LogManager.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(EmployeejpaApplication.class, args);

		LOGGER.info("Info level log message");
		LOGGER.debug("Debug level log message");
		LOGGER.error("Error level log message");
	}

}
