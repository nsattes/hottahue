package de.nsattes.hottahue.spring.service;

import de.nsattes.hottahue.spring.model.HelloModel;

public interface HelloService {

	public HelloModel sayHello();

	public HelloModel sayHello(String name);

}
