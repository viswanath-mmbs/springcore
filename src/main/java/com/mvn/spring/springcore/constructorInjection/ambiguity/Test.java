package com.mvn.spring.springcore.constructorInjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/constructorInjection/ambiguity/config.xml");
		Addition addition = (Addition)ctx.getBean("addition");
		System.out.println(addition);
		
	}

}
