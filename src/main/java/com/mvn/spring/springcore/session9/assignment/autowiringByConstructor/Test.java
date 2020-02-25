package com.mvn.spring.springcore.session9.assignment.autowiringByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session9/assignment/autowiringByConstructor/config.xml");
		Customer customer = (Customer)ctx.getBean("customer");
		System.out.println(customer);
		
	}

}
