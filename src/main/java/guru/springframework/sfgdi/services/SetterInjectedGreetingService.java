package guru.springframework.sfgdi.services;

// @Service(value = "setterInjectedGreetingService")
public class SetterInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Setter";
	}

}
