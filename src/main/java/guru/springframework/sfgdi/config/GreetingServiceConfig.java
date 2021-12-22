/*
 * Java Configuration of the Spring Beans
 */

package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.springframework.pets.CatPetService;
import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;

import guru.springframework.sfgdi.repository.EnglishGreetingRepository;
import guru.springframework.sfgdi.repository.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import guru.springframework.sfgdi.services.I18NSpanishService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {
	
/*
	@Profile("cat")
	@Bean
	PetService catPetService() {
		return new CatPetService();
	}
	
	@Profile({"dog", "default"})
	@Bean
	PetService dogPetService() {
		return new DogPetService();
	}
*/
	
	@Profile("ES")
	@Bean("i18nService")
	I18NSpanishService spanishService() {
		return new I18NSpanishService();
	}
	
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile({"EN", "default"})
	@Bean("i18nService")
	I18nEnglishGreetingService englishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}

	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}

	@Bean
	ConstructorInjectedGreetingService constructorInjectedGreetingService() {
		return new ConstructorInjectedGreetingService();
	}

	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}

	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}

}
