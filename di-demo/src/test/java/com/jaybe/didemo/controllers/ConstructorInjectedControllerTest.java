package com.jaybe.didemo.controllers;

import com.jaybe.didemo.services.ConstructorGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        constructorInjectedController =
                new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void testSayHello() {
        assertTrue(constructorInjectedController.sayHello().contains("constructor"));
    }
}
