package com.mvn.spring.springcore.session9.assignment.autowiringByConstructor;

public class Customer {

	private String name;
	
	private Reservation reservation;
	
	public Customer(Reservation reservation) {
		super();
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}

}
