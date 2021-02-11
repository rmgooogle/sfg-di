package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetongServise;

public class PropertyInjectedController {

    public GreetongServise greetongServise;

    public String getGreeting(){
        return greetongServise.sayGreeting();
    }

}
