package guru.springframework.sfgdi.services;

//@Service(value = "constructorInjectedGreetingService")
public class ConstructorInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
