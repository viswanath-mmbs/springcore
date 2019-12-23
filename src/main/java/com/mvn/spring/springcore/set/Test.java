package com.mvn.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/set/setConfig.xml");
		CarDealer e = (CarDealer) ctx.getBean("carDealers");
		System.out.println(e.getName() +"====="+ e.getModels().getClass());

		System.out.println(e.getName() +"====="+ e.getModels());
	}

}
