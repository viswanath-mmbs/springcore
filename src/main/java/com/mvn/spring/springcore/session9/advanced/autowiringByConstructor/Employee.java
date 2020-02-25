package com.mvn.spring.springcore.session9.advanced.autowiringByConstructor;

public class Employee {

	private Address address;

	public Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
