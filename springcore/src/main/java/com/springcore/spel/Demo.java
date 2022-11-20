package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{12+13}")
	private int x;
	@Value("#{12+13+75+25}")
	private int y;
	@Value("#{T(java.lang.Math).E }")
	private double z;
	@Value("#{ new String('Sandeep kumar') }")
	private String name; 
	
	@Value("#{ 8-4>1 }")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public double getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}
	
	
	
	
	
	
	

}
