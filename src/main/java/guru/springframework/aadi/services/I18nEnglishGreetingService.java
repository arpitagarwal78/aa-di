package guru.springframework.aadi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN") // see application.properties file to see which profile is active
@Service("i18nService") //Qualifier name to service it is same
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld - English";
    }
}
