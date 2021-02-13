package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstrGreetContr;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetongServise(new ConstrGreetContr());
    }

    @Test
    void getGreeting() {
        System.out.println( controller.getGreeting());
    }
}