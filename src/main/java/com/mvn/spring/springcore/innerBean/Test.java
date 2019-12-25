package com.mvn.spring.springcore.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/innerBean/config.xml");
		Employee employee = (Employee)ctx.getBean("employee");
		System.out.println(employee);
		
		
	}

}
