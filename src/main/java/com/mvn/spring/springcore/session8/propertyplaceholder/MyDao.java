package com.mvn.spring.springcore.session8.propertyplaceholder;

public class MyDao {

	private String dbServer;
	
	public MyDao(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + "]";
	}
	
}
