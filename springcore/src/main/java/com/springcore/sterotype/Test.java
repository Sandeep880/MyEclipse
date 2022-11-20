package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=
		new ClassPathXmlApplicationContext("com/springcore/sterotype/steroconfig.xml");
//		Student st= context.getBean("ob",Student.class);
//		System.out.println(st);
//		System.out.println(st.getAddress().getClass().getName());

//		System.out.println(st.hashCode());
//		
//		Student st1= context.getBean("ob",Student.class);
//		System.out.println(st1.hashCode());
		
		Teacher t1= context.getBean("teacher",Teacher.class);
		Teacher t2= context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

		
	}

}
