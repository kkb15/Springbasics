package com.mavencore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/mavencore/standalone/collection/alonconfig.xml");
		Person p=context.getBean("person1",Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("________________________");
		System.out.println(p.getFees());
		System.out.println(p.getFees().getClass().getName());
		System.out.println(p.getProperties());

	}

}
