package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	
	@Bean
	public Award getAward() {
		
		return new Award();
	}
	
	@Bean(name= {"student","system"})
	public Student getStudent() {
		// Creating new Object
		Student student = new Student(getAward());
		return student;
	}
	

}
