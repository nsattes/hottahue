package de.nsattes.hottahue.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	HelloService helloService;

	@GetMapping(value = "")
	public HelloModel helloWorld() {
		return helloService.sayHello();
	}

	@GetMapping(value = "echo/{echoMe}")
	public String echo(@PathVariable String echoMe) {
		logger.error("Calling echo with param: " + echoMe);
		System.err.println("Echo called");
		return echoMe;
	}

	@GetMapping(value = "hello/{name}")
	public HelloModel sayHelloTo(@PathVariable String name) {
		return helloService.sayHello(name);
	}

}
