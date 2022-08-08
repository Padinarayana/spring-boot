package in.sunera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {
	model.addAttribute("message", "welcome to sn");
		return "welcome";
	}
}
