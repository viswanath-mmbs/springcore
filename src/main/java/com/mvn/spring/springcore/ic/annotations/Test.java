package com.mvn.spring.springcore.ic.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/ic/annotations/config.xml");
		Patient p = (Patient)ctx.getBean("patient");
		System.out.println(p);
		
		ctx.registerShutdownHook(); // need to invoke to tell spring container to invoke destroy method
	}

}
