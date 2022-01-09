package guru.springframework.aadi.services;

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld - Constructor";
    }
}
