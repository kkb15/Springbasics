package com.mavencore.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mavencore/value/valueconfig.xml");
        Check check = context.getBean("check", Check.class);
        System.out.println(check);
    } 
}
