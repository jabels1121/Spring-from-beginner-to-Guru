package com.jaybe.didemo.config;

import com.jaybe.didemo.examplebeans.FakeDatasource;
import com.jaybe.didemo.examplebeans.TestBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${jaybe.username}")
    String userName;

    @Value("${jaybe.password}")
    String password;

    @Value("${jaybe.dburl}")
    String dbUrl;

    @Bean
    public FakeDatasource datasource() {
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setDbUrl(dbUrl);
        fakeDatasource.setPassword(password);
        fakeDatasource.setUserName(userName);
        return fakeDatasource;
    }

    @Bean
    public TestBean testBean() {
        return new TestBean("blabla");
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
