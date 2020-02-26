package com.mvn.spring.springcore.session13.injectInterfaceUsingAnnotation;

import org.springframework.stereotype.Component;

//@Component
@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Inside order DAO Create Order");

	}

}
