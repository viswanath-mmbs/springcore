package com.mvn.spring.springcore.session11.sterioTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session11/sterioTypeAnnotation/config.xml");
		Instructor i = (Instructor)ctx.getBean("instructor");
		System.out.println(i);
	}

}
