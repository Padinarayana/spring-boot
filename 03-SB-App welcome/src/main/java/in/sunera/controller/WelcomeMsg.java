package in.sunera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeMsg {

	@GetMapping("/welcomemsg")
	public String welcome(Model model) {
		model.addAttribute("msg", "welcome to Spring boot web MVC");
		return "index";
	}
}
