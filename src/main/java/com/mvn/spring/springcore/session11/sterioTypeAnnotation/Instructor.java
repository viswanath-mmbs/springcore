package com.mvn.spring.springcore.session11.sterioTypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component()  // default bean name is camelcase class name if you want to specify bean name as below line
@Component("inst") 
@Scope("prototype")
public class Instructor {

	@Value("9") // to assign value using annotation @Value
	private int id;
	
	@Value("mvn")
	private String name;
	
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
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

}
