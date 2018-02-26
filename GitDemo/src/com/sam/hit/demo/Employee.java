package com.sam.hit.demo;

public class Employee {

	String id;
	String fName;
	String position;

	public Employee(String id, String fName, String position) {
		super();
		this.id = id;
		this.fName = fName;
		this.position = position;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
