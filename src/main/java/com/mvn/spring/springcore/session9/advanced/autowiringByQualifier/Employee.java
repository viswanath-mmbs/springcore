package com.mvn.spring.springcore.session9.advanced.autowiringByQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mvn.spring.springcore.session9.advanced.autowiringByQualifier.Address;

public class Employee {

	@Autowired(/*required=false*/)
	@Qualifier("address11")  // if not found and required true Error creating bean with name 'employee': Unsatisfied dependency expressed through field 'address'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.mvn.spring.springcore.session9.advanced.autowiringByQualifier.Address' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true), @org.springframework.beans.factory.annotation.Qualifier(value=address11)}
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
