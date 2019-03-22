package de.nsattes.hottahue.test.horses;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import de.nsattes.hottahue.Application;
import de.nsattes.hottahue.hello.HelloController;
import de.nsattes.hottahue.horses.db.HorseController;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
@ContextConfiguration(classes = Application.class)
public class HorseControllerTest {

	@Inject
	private HorseController horses;

	@Test
	public void contextShouldLoad() {
		assertThat(true).as("Context should load").isTrue();
	}

}
