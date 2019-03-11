package de.nsattes.hottahue.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/greetings")
public class GreetingController {

	@GetMapping("/")
	@ResponseBody
	public String greetings() {
		return "I greet you";
	}
}
