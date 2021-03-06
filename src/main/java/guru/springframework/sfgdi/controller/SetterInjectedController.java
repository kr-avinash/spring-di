package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	
	@Qualifier("setterInjectedGreetingService")
	@Autowired
	private GreetingService greeting;
	
	public void setGreeting(GreetingService greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting.sayGreeting();
	}
	
}
