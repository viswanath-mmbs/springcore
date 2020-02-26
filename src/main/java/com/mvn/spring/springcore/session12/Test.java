package com.mvn.spring.springcore.session12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session12/config.xml");
		Instructor i = (Instructor)ctx.getBean("inst");
		System.out.println(i);
		
		Instructor i2 = (Instructor)ctx.getBean("inst");
		System.out.println(i2);
	}

}
