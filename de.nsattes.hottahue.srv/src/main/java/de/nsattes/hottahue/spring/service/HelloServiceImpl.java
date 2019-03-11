package de.nsattes.hottahue.spring.service;

import org.springframework.stereotype.Service;
import de.nsattes.hottahue.spring.model.HelloModel;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public HelloModel sayHello() {
		return new HelloModel();
	}

	public HelloModel sayHello(String name) {
		return new HelloModel(name);
	}

}
