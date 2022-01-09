package guru.springframework.aadi.services;

public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - Spanish";
    }
}
