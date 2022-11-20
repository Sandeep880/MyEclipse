package com.springcore.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=
		    new ClassPathXmlApplicationContext("com/springcore/references/refconfig.xml");
		A object = (A)context.getBean("aref");
		
		System.out.println(object.getX());
		System.out.println(object.getOb().getY());
		System.out.println(object);

	}

}
