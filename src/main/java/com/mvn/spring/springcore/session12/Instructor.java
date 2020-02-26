package com.mvn.spring.springcore.session12;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component()  // default bean name is camelcase class name if you want to specify bean name as below line
@Component("inst") 
@Scope("prototype")
public class Instructor {

//	@Value("#{1+8}") // to assign value using annotation @Value
//	@Value("#{-99}")
//	@Value("#{T(java.lang.Math).abs(-99)}") //  static methods
//	@Value("#{new Integer(95)}") //  using new operator
	@Value("#{T(java.lang.Integer).MIN_VALUE}")  
	private int id = 19;
	
//	@Value("mvn")
//	@Value("#{'Viswanath  M'}")
//	@Value("#{'Viswanath  M'.toUpperCase()}")
	@Value("#{new java.lang.String('viswanath mmm')}")
	private String name;
	
//	@Value("#{2+4>9}")
	@Value("#{2+4>5 ? true : false}")
	private boolean active;
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;

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

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", topics=" + topics + ", profile="
				+ profile + "]";
	}

}
