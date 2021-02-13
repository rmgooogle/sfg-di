package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjContr {
    private final GreetingService greetingService;


    public ConstructorInjContr(@Qualifier("constrGreetContr") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting () {
        return greetingService.sayGreeting();
    }
}
