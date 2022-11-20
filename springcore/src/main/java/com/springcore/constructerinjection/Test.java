package com.springcore.constructerinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
		new ClassPathXmlApplicationContext("com/springcore/constructerinjection/ciconfig.xml");
		
		State s1 = (State)context.getBean("state");
		System.out.println(s1.toString());
		
		
//		Addition add1 = (Addition)context.getBean("add");
//		
//		add1.doSum();
	}

}
