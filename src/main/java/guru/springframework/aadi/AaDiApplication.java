package guru.springframework.aadi;

import guru.springframework.aadi.controllers.*;
import guru.springframework.aadi.services.PrototypeBean;
import guru.springframework.aadi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AaDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =
				SpringApplication.run(AaDiApplication.class, args);

		// it get's me myController from the application context
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----- MyController");

		String sayGreetings = myController.sayHello();

		System.out.println(sayGreetings);

		System.out.println("----- Property");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter");

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor");

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("--- PROFILE DEMO");

		// if we have not created profile spring will be confused
		// application.properties have EN enabled - thus no conflict
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("_________ BEAN SCOPE________");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		System.out.println("_________ PROTOTYPE BEAN SCOPE________");
		// everytime constructor is called
		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

	}

}
