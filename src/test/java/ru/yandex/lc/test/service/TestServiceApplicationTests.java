package ru.yandex.lc.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestServiceApplicationTests {

	@Autowired
	private TestRestTemplate template;

	@Autowired
	AddController addController;

	@Test
	void contextLoads() {
	}

	@Test
	void testAddControllerMath() {
		Assertions.assertEquals(3, addController.add(1, 2));
	}

	@Test
	void testAddControllerHttp() {
		Assertions.assertEquals(5, template.getForObject("/add?a=2&b=3", Integer.class));
	}

}
