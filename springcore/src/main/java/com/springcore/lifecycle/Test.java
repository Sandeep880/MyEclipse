package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=
		new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		
//		Car car1 = (Car) context.getBean("car");
//		
//		System.out.println(car1.toString());
		// registering shutdown hook 
		context.registerShutdownHook();
		
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		Motorcycle m1= (Motorcycle)context.getBean("motor");
//		System.out.println(m1);
		
		Bicycle b= (Bicycle) context.getBean("cycle");
		System.out.println(b);
		

	}

}
