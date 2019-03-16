package de.nsattes.hottahue.hello;

import org.springframework.stereotype.Service;

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
