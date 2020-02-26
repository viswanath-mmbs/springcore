package com.mvn.spring.springcore.session13.injectInterfaceUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Component("orderBOImpl")
@Component("bo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("dao2")
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
