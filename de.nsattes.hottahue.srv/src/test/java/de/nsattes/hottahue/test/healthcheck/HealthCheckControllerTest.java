package de.nsattes.hottahue.test.healthcheck;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
@ComponentScan(value = "de.nsattes.hottahue")
public class HealthCheckControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void springContextDoesLoad() {
		assertTrue(true);
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		mvc.perform(get("/healthcheck"))
			.andExpect(status().isOk());
	}

}
