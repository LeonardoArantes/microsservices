package com.microsservice_a.Microsservice_a;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MicrosserviceAApplicationTests {

	@Test
	void contextLoads() {
	}

}
