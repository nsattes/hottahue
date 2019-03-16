package de.nsattes.hottahue.test.hello;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import de.nsattes.hottahue.Application;
import de.nsattes.hottahue.hello.HelloController;
import de.nsattes.hottahue.hello.HelloService;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
@ContextConfiguration(classes = Application.class)
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private HelloService helloService;

	@Autowired
	private HelloController controller;

	@Test
	public void tautology() {
		assertTrue("Test Setup is not working!", true);
	}

	@Test
	public void springContextDoesLoad() {
		assertNotNull(controller);
	}

	@Test
	public void echoShouldReturnInput() throws Exception {
		String input = "HalloWelt";
		mvc.perform(get("/echo/" + input)
				.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$", is(input)));
	}

}
