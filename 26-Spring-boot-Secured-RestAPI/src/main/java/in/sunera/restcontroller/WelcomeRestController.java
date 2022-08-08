package in.sunera.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welmsg() {
		String msg="welcome to sunera......";
		return msg;
	}
	
	
	@GetMapping("/balance")
	public String welbalance() {
		String msg="welcome to sunera......54324";
		return msg;
	}
}
