package com.mvn.spring.springcore.ic.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("cleanup");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
