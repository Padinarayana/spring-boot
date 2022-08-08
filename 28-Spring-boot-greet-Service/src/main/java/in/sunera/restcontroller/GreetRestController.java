package in.sunera.restcontroller;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sunera.client.WelcomeServiceClient;

@RestController
public class GreetRestController  {

	@Autowired
	private WelcomeServiceClient welcomeServiceClient;
	
	
	@GetMapping("/greet")
	public String greetMsg() {
		String greetResp= "Good Morning";
		String welcomeResp = welcomeServiceClient.invokeWelcomeService();

		StringJoiner joiner = new StringJoiner(",");
		joiner.add(greetResp);
		joiner.add(welcomeResp);

		return joiner.toString();
	}
}
