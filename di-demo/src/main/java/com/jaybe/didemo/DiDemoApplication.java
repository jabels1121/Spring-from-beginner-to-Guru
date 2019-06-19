package com.jaybe.didemo;

import com.jaybe.didemo.controllers.ConstructorInjectedController;
import com.jaybe.didemo.controllers.MyController;
import com.jaybe.didemo.controllers.PropertyInjectedController;
import com.jaybe.didemo.controllers.SetterInjectedController;
import com.jaybe.didemo.examplebeans.FakeDatasource;
import com.jaybe.didemo.examplebeans.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        FakeDatasource fakeDatasource = ctx.getBean(FakeDatasource.class);
        TestBean te = ctx.getBean(TestBean.class);
        System.out.println(fakeDatasource.getPassword());
        System.out.println(te.getName());

    }

}
