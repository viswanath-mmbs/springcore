package com.mvn.spring.springcore.session13.injectInterfaceUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session13/injectInterfaceUsingAnnotation/config.xml");
//		OrderBO bo = (OrderBO)ctx.getBean("orderBOImpl");
		OrderBO bo = (OrderBO)ctx.getBean("bo");
		bo.palceOrder();
		
	}

}
