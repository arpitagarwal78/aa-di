package guru.springframework.aadi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "HelloWorld - English";
    }
}
