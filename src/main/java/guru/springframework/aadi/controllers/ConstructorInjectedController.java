package guru.springframework.aadi.controllers;

import guru.springframework.aadi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// look at test class to see how spring inject dependency for this type
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService; // most preferred use private final

    // @Autowire is optional in constructor
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
