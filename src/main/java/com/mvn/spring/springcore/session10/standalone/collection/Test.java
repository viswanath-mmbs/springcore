package com.mvn.spring.springcore.session10.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session10/standalone/collection/config.xml");
		ProductsList pl = (ProductsList)ctx.getBean("productList");
		System.out.println(pl);
	}

}
