package com.ul.ims.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ul.ims"})
public class RideTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideTestApplication.class, args);
	}

}
