package in.sunera.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "welcome to Sunera Technologies";
	}

}
