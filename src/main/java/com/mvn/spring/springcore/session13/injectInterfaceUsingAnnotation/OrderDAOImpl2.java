package com.mvn.spring.springcore.session13.injectInterfaceUsingAnnotation;

import org.springframework.stereotype.Component;

//@Component
@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Inside OrderDAOImpl2 Create Order");

	}

}
