package com.example.obspringsesion10deploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;

@SpringBootTest
class ObSpringSesion10DeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key,value) -> System.out.println(key + " " + value)
		);
	}

}
