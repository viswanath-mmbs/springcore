package com.mvn.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/list/listConfig.xml");
		Hospital e = (Hospital) ctx.getBean("hospital");
		System.out.println(e.getName() +"====="+ e.getDepartments().getClass());
	}

}
