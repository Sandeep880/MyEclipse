package com.springcore.lifecycle;

public class Car {
	private double maxSpeed;

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		System.out.println("setting price");
		this.maxSpeed = maxSpeed;
	}

	public Car(double maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + "]";
	}
	
	public void init() {
		System.out.println("Inside in the init methods");
	}
	
	public void destroy() {
		System.out.println("Inside in destroy methods");
	}
	
	
	

}
