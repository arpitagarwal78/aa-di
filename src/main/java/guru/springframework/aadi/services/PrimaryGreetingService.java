package guru.springframework.aadi.services;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld - Primary Bean";
    }
}
