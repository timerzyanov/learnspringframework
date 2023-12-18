package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ranga";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 20);
    }

    @Bean
    @Primary
    public Person person2(){
        return new Person("Ravi2", 202);
    }
}
