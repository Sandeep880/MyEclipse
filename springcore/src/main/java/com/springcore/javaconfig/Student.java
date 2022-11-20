package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Student {
	
	
	private Award award;
	
	public Award getAward() {
		return award;
	}

	public void setAward(Award award) {
		this.award = award;
	}
	
	

	

	public Student(Award award) {
		super();
		this.award = award;
	}

	public void study() {
		this.award.display();
		System.out.println("student is reading book");
	}
	
}
