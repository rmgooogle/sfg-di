package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetongServiseImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjContrTest {
    ConstructorInjContr controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjContr(new GreetongServiseImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}