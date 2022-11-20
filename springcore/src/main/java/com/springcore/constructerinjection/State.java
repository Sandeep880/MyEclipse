package com.springcore.constructerinjection;

import java.util.List;

public class State {
	
	private String name;
	private int noOfPeople;
	private City city;
	private List<String> noOfMC;
	
	public State(String name,int noOfPeople,City city,List<String> noOfMC) {
		this.name=name;
		this.noOfPeople=noOfPeople;
		this.city=city;
		this.noOfMC=noOfMC;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", noOfPeople=" + noOfPeople + "]"+" {" + this.city.noOfCity + " }"
				+" {"+this.noOfMC+ " }";
	}
	

}
