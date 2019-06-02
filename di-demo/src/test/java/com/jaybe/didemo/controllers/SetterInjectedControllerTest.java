package com.jaybe.didemo.controllers;

import com.jaybe.didemo.services.GreetingService;
import com.jaybe.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        GreetingService greetingService = new GreetingServiceImpl();
        this.setterInjectedController.setGreetingService(greetingService);
    }

    @Test
    public void testSayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}
