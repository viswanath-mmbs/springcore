package com.mvn.spring.springcore.session13.injectInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session13/injectInterface/config.xml");
		OrderBO bo = (OrderBO)ctx.getBean("bo");
		bo.palceOrder();
		
	}

}
