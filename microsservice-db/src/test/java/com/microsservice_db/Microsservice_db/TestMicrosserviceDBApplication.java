package com.microsservice_db.Microsservice_db;

import org.springframework.boot.SpringApplication;

public class TestMicrosserviceDBApplication {

	public static void main(String[] args) {
		SpringApplication.from(MicrosserviceDBApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
