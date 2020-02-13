package com.mvn.spring.springcore.constructorInjection.ambiguity;

public class Addition {

	/*Addition(double a, double b) {
		System.out.println("inside constructor double");
	}

	Addition(int a, int b) {
		System.out.println("inside constructor int");
	}

	Addition(String a, String b) {
		System.out.println("inside constructor String");
	}*/
	
	Addition(int a, double b) {
		System.out.println("inside constructor double");
	}

}
