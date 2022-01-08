package guru.springframework.aadi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("ES")
@Profile({"ES", "default"}) // spring has a default profile as this, we can remove active.profile setting from application properties
// if means ES , default profile are set, if nothing mention use this as default
@Service("i18nService") //Qualifier name to service
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - Spanish";
    }
}
