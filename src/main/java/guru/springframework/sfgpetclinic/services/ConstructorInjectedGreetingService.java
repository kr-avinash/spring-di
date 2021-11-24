package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service(value = "constructorInjectedGreetingService")
public class ConstructorInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
