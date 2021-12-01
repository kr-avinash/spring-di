package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgdi.repository.EnglishGreetingRepository;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
	
	private final EnglishGreetingRepository greetingRepository;
	
	public I18nEnglishGreetingService(EnglishGreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}