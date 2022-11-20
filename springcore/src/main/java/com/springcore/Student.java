package com.springcore;

public class Student {
	private int studentId;
	private String name;
	private String address;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting studentID");
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting student name");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Setting student address");
		this.address = address;
	}
	public Student(int studentId, String name, String address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
