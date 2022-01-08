package guru.springframework.aadi.services;

import org.springframework.stereotype.Service;

@Service // this is used to tell spring that GreetingService interface type is available
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld - Property";
    }
}
