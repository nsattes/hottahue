package de.nsattes.hottahue.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {

	@GetMapping("/")
	public String getStatus() {
		return "Hi. Your app is running";
	}
}
