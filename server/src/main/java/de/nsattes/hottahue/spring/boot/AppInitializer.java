package de.nsattes.hottahue.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import de.nsattes.hottahue.spring.controller.HelloController;
import de.nsattes.hottahue.spring.service.HelloService;
import de.nsattes.hottahue.spring.service.HelloServiceImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
public class AppInitializer extends SpringApplication {

	public static void main(String args[]) {
		SpringApplication.run(AppInitializer.class, args);
	}

	@Bean
	public HelloService getHelloService() {
		return new HelloServiceImpl();
	}
}
