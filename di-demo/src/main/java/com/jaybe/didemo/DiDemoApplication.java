package com.jaybe.didemo;

import com.jaybe.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) run.getBean("myController");

        myController.hello();
        ((ConfigurableApplicationContext) run).close();
    }

}
