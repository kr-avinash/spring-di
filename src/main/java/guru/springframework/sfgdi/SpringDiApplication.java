package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18nController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PetController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;

@ComponentScan(basePackages = { "guru.springframework.sfgdi", "com.springframework.pets" })
@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		System.out.println("----- The Best Pet ---");
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("---- i18N ----------------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("---- Primary ----------------");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("---- Property ----------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---- Setter ------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor --------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
