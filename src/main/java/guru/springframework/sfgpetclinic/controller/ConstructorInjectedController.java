package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgpetclinic.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	// @Autowired annotation is Optional here since Spring 4.x
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
