package com.example.demo;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class ProducerDemoApplicationTests {

	@Autowired
	private WebApplicationContext context;

	@Test
	void contextLoads() {
	}

	@BeforeAll
	public void setUp(){
		RestAssuredMockMvc.webAppContextSetup(context);
	}

}
