package ru.yandex.lc.test.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@GetMapping("/add")
	public int add(int a, int b) {
		return a + b;
	}

}
