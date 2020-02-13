package com.mvn.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext	 ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/lc/annotations/config.xml");
		Patient student = (Patient) ctx.getBean("patient");
		System.out.println(student);
		
		ctx.registerShutdownHook();
	}

}
