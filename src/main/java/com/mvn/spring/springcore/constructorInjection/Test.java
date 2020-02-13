package com.mvn.spring.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/constructorInjection/config.xml");
		Employee employee = (Employee)ctx.getBean("employee");
		System.out.println(employee.hashCode() + "=====" + employee.getAddress().hashCode());
		
		Employee employee1 = (Employee)ctx.getBean("employee");
		System.out.println(employee1.hashCode() + "=====" + employee1.getAddress().hashCode());
	}

}
