package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            //System.out.println(context.getBean("name"));
            //System.out.println(context.getBean("age"));
            //System.out.println(context.getBean("pers"));
            //System.out.println(context.getBean(Person.class));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
