package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	// @Autowired annotation is Optional here since Spring 4.x
	public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
