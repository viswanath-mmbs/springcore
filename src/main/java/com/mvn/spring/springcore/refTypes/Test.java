package com.mvn.spring.springcore.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/refTypes/studentConfig.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
	}

}
