package com.mvn.spring.springcore.session11.sterioTypeAnnotation;

import org.springframework.stereotype.Component;

@Component()  // default bean name is camelcase class name if you want to specify bean name as below line
//@Component("inst") 
public class Instructor {

	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	
}
