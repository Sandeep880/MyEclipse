package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 *  1.Create maven Project
      2.Adding denpencies -- spring core,spring context
      3.creating bean--- java pojo
      4.creating confriguration file --config.xml
      5.setter Injection
      6. Main class : which can pull the object and use.
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= 
    	new ClassPathXmlApplicationContext("config.xml");
        
        Student student1 = (Student)context.getBean("student1");
        
        System.out.println(student1.toString());
        
        Student student2 =(Student)context.getBean("student2");
        System.out.println(student2.toString());

        
    }
}
