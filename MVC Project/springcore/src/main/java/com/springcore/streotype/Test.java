package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/streotype/streoconfig.xml");
//		System.out.println(context.getBean("data",Student.class));
//		System.out.println(context.getBean("student",Student.class));
		Student s=context.getBean("data",Student.class);
		System.out.println(s.hashCode());
		
		Student s1=context.getBean("data",Student.class);
		System.out.println(s1.hashCode());

	}

}
