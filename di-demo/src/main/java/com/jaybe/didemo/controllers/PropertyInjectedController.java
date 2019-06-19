package com.jaybe.didemo.controllers;


import com.jaybe.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; // qualifying bean by same property name

    // but @Primary annotation has greater priority
    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
