package com.jaybe.didemo.examplebeans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean {
    private String name;

    private final FakeDatasource datasource;

    public String getName() {
        return name;
    }


    public TestBean(String name, @Autowired FakeDatasource datasource) {
        this.name = name;
        this.datasource = datasource;
    }

    public FakeDatasource getDatasource() {
        return datasource;
    }
}
