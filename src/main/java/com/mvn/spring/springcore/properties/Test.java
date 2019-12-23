package com.mvn.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mvn/spring/springcore/properties/propertiesConfig.xml");
		CountriesAndLanguages customer = (CountriesAndLanguages) ctx.getBean("countriesAndLanga");
		System.out.println(customer);
	}

}
