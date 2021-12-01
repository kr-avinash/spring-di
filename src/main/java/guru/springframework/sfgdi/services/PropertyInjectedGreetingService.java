package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service(value = "propertyInjectedGreetingService")
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Property";
	}

}
