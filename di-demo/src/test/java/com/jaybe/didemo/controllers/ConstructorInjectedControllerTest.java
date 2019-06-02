package com.jaybe.didemo.controllers;

import com.jaybe.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        constructorInjectedController =
                new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testSayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }

}
