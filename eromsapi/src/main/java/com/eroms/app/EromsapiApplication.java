package com.eroms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.eroms.controller.TestAPIController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestAPIController.class)
public class EromsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EromsapiApplication.class, args);
	}

}
