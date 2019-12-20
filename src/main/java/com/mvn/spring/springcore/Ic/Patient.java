package com.mvn.spring.springcore.Ic;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("inside hi method");
	}
	
	public void buy() {
		System.out.println("inside buy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
}
