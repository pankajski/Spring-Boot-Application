package in.cdac.springsecutity.learn.spring.security.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSecurity {
	
	@GetMapping("/")
	public String welcomePage() {
		return "Welcome to Security Application Page!🙏🙏🙏🙏";
	}
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
