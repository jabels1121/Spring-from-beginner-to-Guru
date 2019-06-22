package com.jaybe.didemo.config;

import com.jaybe.didemo.examplebeans.FakeDatasource;
import com.jaybe.didemo.examplebeans.FakeJmsBroker;
import com.jaybe.didemo.examplebeans.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource(value = {"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${jaybe.username}")
    String userName;

    @Value("${jaybe.password}")
    String password;

    @Value("${jaybe.dburl}")
    String dbUrl;

    @Value("${jaybe.jms.username}")
    String jmsUserName;

    @Value("${jaybe.jms.password}")
    String jmsPassword;

    @Value("${jaybe.jms.url}")
    String jmsUrl;

    @Autowired
    Environment environment;

    @Bean
    public FakeDatasource datasource() {
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setDbUrl(environment.getProperty("JAVA_HOME"));
        fakeDatasource.setPassword(password);
        fakeDatasource.setUserName(userName);
        return fakeDatasource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUserName);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public TestBean testBean(FakeDatasource fakeDatasource) {
        return new TestBean("blabla", fakeDatasource);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
