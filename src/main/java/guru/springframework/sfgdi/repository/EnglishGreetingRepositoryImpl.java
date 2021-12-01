package guru.springframework.sfgdi.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

	@Override
	public String getGreeString() {
		return "Hello World - EN";
	}
	

}
