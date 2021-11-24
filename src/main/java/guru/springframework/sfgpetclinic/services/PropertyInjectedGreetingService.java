package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service(value = "propertyInjectedGreetingService")
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Property";
	}

}
