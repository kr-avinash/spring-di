package guru.springframework.sfgpetclinic.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.services.ConstructorInjectedGreetingService;

public class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreeting(new ConstructorInjectedGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
