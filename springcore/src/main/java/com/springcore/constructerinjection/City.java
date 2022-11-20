package com.springcore.constructerinjection;

public class City {
	String noOfCity;

	public String getNoOfCity() {
		return noOfCity;
	}

	public void setNoOfCity(String noOfCity) {
		this.noOfCity = noOfCity;
	}

	public City(String noOfCity) {
		super();
		this.noOfCity = noOfCity;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "City [noOfCity=" + noOfCity + "]";
	}
	

}
