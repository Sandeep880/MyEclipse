package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motorcycle implements InitializingBean , DisposableBean {
	
	private int noOfWheels;

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public Motorcycle(int noOfWheels) {
		super();
		this.noOfWheels = noOfWheels;
	}

	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Motorcycle [noOfWheels=" + noOfWheels + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init methods
		System.out.println("Ridding BikeCycle init methods");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy  methods
		System.out.println("Riding Car destroy methods");
		
	}
	

}
