package in.sunera.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	
	@GetMapping("/greet")
	public String welcomeMsg() {
		return "Good Morning.........";
	}
}
