package com.mvn.spring.springcore.ic.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("inside hi method");
	}
	
	public void buy() {
		System.out.println("inside buy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside after properties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Insdie Destroy");
	}
	
}
