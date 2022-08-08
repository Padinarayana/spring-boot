package in.sunera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "HelloWorld");
		return "helloworld";
	}
	
	@RequestMapping("/book")
	public String book() {
		return "addBook";
	}
	
	@RequestMapping("/style")
	public String style() {
		return "add-css-js-demo";
	}
}
