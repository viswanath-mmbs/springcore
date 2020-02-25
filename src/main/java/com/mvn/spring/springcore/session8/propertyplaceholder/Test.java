package com.mvn.spring.springcore.session8.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session8/propertyplaceholder/config.xml");
		MyDao dao = (MyDao)ctx.getBean("myDao");
		System.out.println(dao);
		
	}
}
