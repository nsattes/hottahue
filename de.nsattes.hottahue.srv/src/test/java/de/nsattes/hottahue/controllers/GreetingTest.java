package de.nsattes.hottahue.controllers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import de.nsattes.hottahue.spring.boot.AppInitializer;
import de.nsattes.hottahue.spring.controller.GreetingController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppInitializer.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class GreetingTest {

	@Autowired
	private GreetingController controller;

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate template;

	@Test
	public void tautology() {
		assertTrue(true);
	}

	@Test
	public void springContextDoesLoad() throws Exception {
		assertNotNull(controller);
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		this.template.getForObject("http://localhost:" + port + "/greetings", String.class).toLowerCase()
				.contains("greet");
	}

}
