package de.nsattes.hottahue.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppInitializer extends SpringApplication {
	
	public static void main(String args[]) {
		SpringApplication.run(AppInitializer.class, args);
	}

}
