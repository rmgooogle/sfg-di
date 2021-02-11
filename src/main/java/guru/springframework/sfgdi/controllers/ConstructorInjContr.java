package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetongServise;

public class ConstructorInjContr {
    private final GreetongServise greetongServise;

    public ConstructorInjContr(GreetongServise greetongServise) {
        this.greetongServise = greetongServise;
    }

    public String getGreeting () {
        return greetongServise.sayGreeting();
    }
}
