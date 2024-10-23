package com.microsservice_db.Microsservice_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.microsservice_db.Model"})
public class MicrosserviceDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosserviceDBApplication.class, args);
	}

}