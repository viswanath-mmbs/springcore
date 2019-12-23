package com.mvn.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/map/mapConfig.xml");
		Customer customer = (Customer) ctx.getBean("customers");
		System.out.println(customer);
	}

}
