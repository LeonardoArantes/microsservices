package com.microsservice_db;

import org.springframework.boot.SpringApplication;

import com.microsservice_db.MicrosserviceDBApplication;

public class TestMicrosserviceDBApplication {

	public static void main(String[] args) {
		SpringApplication.from(MicrosserviceDBApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
