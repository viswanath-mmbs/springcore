package com.mvn.spring.springcore.dependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/dependencyCheck/config.xml");
		Prescription p = (Prescription)ctx.getBean("Prescription");
		System.out.println(p);
		
		
	}

}
