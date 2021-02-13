package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstrGreetContr;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjContrTest {
    ConstructorInjContr controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjContr(new ConstrGreetContr());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}