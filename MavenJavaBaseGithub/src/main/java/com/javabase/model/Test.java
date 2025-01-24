package com.javabase.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
		Student s=(Student) ap.getBean("st");
		System.out.println(s.getName());
		System.out.println(s.getAddr());
		System.out.println(s.getRoll());

	}

}
