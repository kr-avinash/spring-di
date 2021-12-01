package guru.springframework.sfgdi.services;

// @Service(value = "propertyInjectedGreetingService")
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Property";
	}

}
