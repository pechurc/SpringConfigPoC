package net.eivsoftware.greetingservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${greeting.message}")
	private String greeting;
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	
	@Value("${spring.datasource.jdbc-url}")
	private String jdbcUrl;
	
	@GetMapping()
	public String greeting() {
		return greeting + " driverClassName:" + driverClassName + " jdbcUrl:" + jdbcUrl;
	}
}
