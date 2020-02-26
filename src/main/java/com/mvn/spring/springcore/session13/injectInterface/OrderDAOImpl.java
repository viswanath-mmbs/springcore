package com.mvn.spring.springcore.session13.injectInterface;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Inside order DAO Create Order");

	}

}
