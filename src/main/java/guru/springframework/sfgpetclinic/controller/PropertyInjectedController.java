package guru.springframework.sfgpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgpetclinic.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
