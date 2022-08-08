package in.sunera.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserClientRestController {

	 private static final Logger LOGGER = LoggerFactory.getLogger(UserClientRestController.class);
	    @Autowired
	    private RestTemplate restTemplate;
	 
	    
	    @GetMapping(path = "/getUsers-client")
	    public List getClientHello() {
	        LOGGER.info("about to call userms");
	        return restTemplate.getForObject("http://user/getUsers", List.class);
	    }
	    
}
