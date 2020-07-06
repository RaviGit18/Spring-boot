package io.ravi.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting: default value}")
	private String greetingMessage;

	@Value("some static message")
	private String staticMessage;

	@Value("${my.list.messages}")
	private List<String> listOfMessage;

	@Value("#{${db.values}}")
	private Map<String, String> dbValues;

	@Autowired
	private DBSettings dbSettings;
	
	@Autowired
	private Environment env;

	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage + " " + staticMessage + " " + listOfMessage + " " + dbValues + " " + dbSettings.getHost()
				+ " " + dbSettings.getPort() + " " + dbSettings.getConnection();
	}
	
	@GetMapping("/envDetails")
	public String envDetails() {
		return env.toString();
	}
}
