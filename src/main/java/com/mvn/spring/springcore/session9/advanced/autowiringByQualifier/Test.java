package com.mvn.spring.springcore.session9.advanced.autowiringByQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mvn/spring/springcore/session9/advanced/autowiringByQualifier/config.xml");
		Employee employee = (Employee)ctx.getBean("employee");
		System.out.println(employee.hashCode() + "=====" + employee.getAddress());
	}

}
