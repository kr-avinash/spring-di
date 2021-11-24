package guru.springframework.sfgpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgpetclinic.services.GreetingService;

@Controller
public class SetterInjectedController {

	@Autowired
	private GreetingService greeting;
	
	public void setGreeting(GreetingService greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
	
}
