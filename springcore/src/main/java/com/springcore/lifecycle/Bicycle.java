package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bicycle {
	private int noOfTyre;

	public int getNoOfTyre() {
		return noOfTyre;
	}

	public void setNoOfTyre(int noOfTyre) {
		this.noOfTyre = noOfTyre;
	}

	public Bicycle(int noOfTyre) {
		super();
		this.noOfTyre = noOfTyre;
	}

	public Bicycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bicycle [noOfTyre=" + noOfTyre + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Starting  methods");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending methods");
	}

}
