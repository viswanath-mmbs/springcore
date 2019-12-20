package com.mvn.spring.springcore.Ic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/Ic/config.xml");
		Patient p = (Patient)ctx.getBean("patient");
		System.out.println(p);
		
	}

}
