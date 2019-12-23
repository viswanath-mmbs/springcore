package com.mvn.spring.springcore.refTypes1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/refTypes1/shoppingCartConfig.xml");
		ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingCart");
		System.out.println(shoppingCart);
	}

}
