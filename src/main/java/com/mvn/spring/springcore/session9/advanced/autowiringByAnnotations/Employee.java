package com.mvn.spring.springcore.session9.advanced.autowiringByAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvn.spring.springcore.session9.advanced.autowiringByConstructor.Address;

public class Employee {

//	@Autowired  // not working
	public Employee(Address address) {
		this.address = address;
	}

	
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
