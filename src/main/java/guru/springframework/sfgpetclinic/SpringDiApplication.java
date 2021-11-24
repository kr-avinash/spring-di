package guru.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import guru.springframework.sfgpetclinic.controller.ConstructorInjectedController;
import guru.springframework.sfgpetclinic.controller.MyController;
import guru.springframework.sfgpetclinic.controller.PropertyInjectedController;
import guru.springframework.sfgpetclinic.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
	
		String greetings = myController.sayHello();
		System.out.println(greetings);
		
		System.out.println("---- Property ----------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("---- Setter ------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("------ Constructor --------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
		
		
		
	}

}
