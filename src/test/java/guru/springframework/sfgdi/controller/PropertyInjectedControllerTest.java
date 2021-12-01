package guru.springframework.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;

public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setup() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorInjectedGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
		assertEquals(controller.getGreeting(), "Hello World");
	}
}
