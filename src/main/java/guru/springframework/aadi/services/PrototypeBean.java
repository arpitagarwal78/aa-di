package guru.springframework.aadi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // to tell it is prototype type - new instance on every request
@Controller
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating a Prototype bean!!!!!!!!!!!!!!!!!!!!!");
    }
    public String getMyScope(){
        return "I'm a Prototype";
    }
}
