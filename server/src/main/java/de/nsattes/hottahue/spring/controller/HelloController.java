package de.nsattes.hottahue.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.nsattes.hottahue.spring.model.HelloModel;
import de.nsattes.hottahue.spring.service.HelloService;

@RestController
@RequestMapping
public class HelloController {

	@Autowired
	HelloService helloService;

	@GetMapping(value = "/")
	public HelloModel helloWorld() {
		return helloService.sayHello();
	}

	@GetMapping(value = "/{name}")
	public HelloModel generateRandom(@PathVariable String name) {
		return helloService.sayHello(name);
	}

}
