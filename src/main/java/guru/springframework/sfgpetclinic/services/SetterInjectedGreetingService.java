package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service(value = "setterInjectedGreetingService")
public class SetterInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Setter";
	}

}
