package com.mvn.spring.springcore.session13.injectInterface;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;
	
	@Override
	public void palceOrder() {

		System.out.println("Inside order BO");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
