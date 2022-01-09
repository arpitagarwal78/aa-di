package guru.springframework.aadi.config;

import guru.springframework.aadi.controllers.PropertyInjectedController;
import guru.springframework.aadi.controllers.SetterInjectedController;
import guru.springframework.aadi.repositories.EnglishGreetingRepository;
import guru.springframework.aadi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.aadi.services.ConstructorGreetingService;
import guru.springframework.aadi.services.I18nEnglishGreetingService;
import guru.springframework.aadi.services.I18nSpanishGreetingService;
import guru.springframework.aadi.services.PrimaryGreetingService;
import org.springframework.context.annotation.*;

@ImportResource("classpath:aadi-config.xml")
@Configuration // Spring will look into this class to see configuration
public class GreetingServiceConfig {

    // no need to add Bean as XML file loads that for us
    ConstructorGreetingService constructorGreetingService(){ // this becomes the name of bean
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedController propertyInjectedController() {
        return new PropertyInjectedController();
    }

    @Bean
    SetterInjectedController setterInjectedController() {
        return new SetterInjectedController();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService
        i18nService(EnglishGreetingRepository englishGreetingRepository){ // dependency injection with java configuration
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService") // this will give same class name as english and profile will tell what to use
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }
}
