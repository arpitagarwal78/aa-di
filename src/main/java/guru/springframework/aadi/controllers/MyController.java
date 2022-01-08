package guru.springframework.aadi.controllers;

import guru.springframework.aadi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller // this is required by spring to understand this is controller bean
public class MyController {

    private final GreetingService greetingService;

    // no qualifier , multiple GreetingServiceImpl thus Primary Bean (PrimaryGreetingService) take priority
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
