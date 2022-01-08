package guru.springframework.aadi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // if thr is conflict in implementation and Qualifier not provided this will take precedence
@Service // this is used to tell spring that GreetingService interface type is available
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld - Primary Bean";
    }
}
