package com.mvn.spring.springcore.session10.standalone.collection;

import java.util.List;

public class ProductsList {

	private List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

	@Override
	public String toString() {
		return "ProductsList [productNames=" + productNames + "]";
	}
	
}
