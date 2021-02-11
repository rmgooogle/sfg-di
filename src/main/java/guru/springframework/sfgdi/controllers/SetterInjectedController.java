package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetongServise;

public class SetterInjectedController {

    private GreetongServise greetongServise;

    public void setGreetongServise(GreetongServise greetongServise){
        this.greetongServise = greetongServise;
    }

    public String getGreeting(){
        return greetongServise.sayGreeting();
    }

}
