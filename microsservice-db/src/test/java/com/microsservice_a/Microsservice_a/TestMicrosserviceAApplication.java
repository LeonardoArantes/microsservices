package com.microsservice_a.Microsservice_a;

import org.springframework.boot.SpringApplication;

public class TestMicrosserviceAApplication {

	public static void main(String[] args) {
		SpringApplication.from(MicrosserviceAApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
