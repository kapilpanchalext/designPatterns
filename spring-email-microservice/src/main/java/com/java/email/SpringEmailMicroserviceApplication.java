package com.java.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEmailMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailMicroserviceApplication.class, args);
	}

}
