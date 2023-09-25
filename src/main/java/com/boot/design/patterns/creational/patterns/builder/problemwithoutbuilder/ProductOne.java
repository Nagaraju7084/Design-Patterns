package com.boot.design.patterns.creational.patterns.builder.problemwithoutbuilder;

import java.math.BigDecimal;

public class ProductOne {
	
	private int productId;
	private String productName;
	private BigDecimal productPrice;
	private String productColor;
	
	//product without properties
	public ProductOne() {
		// TODO Auto-generated constructor stub
	}
	
	//product without productId properties
	public ProductOne(int productId) {
		this.productId = productId;
	}
	
	//product without productName properties
	public ProductOne(String productName) {
		this.productName = productName;
	}
	
	////product without productId and productName properties
	public ProductOne(int productId, String productName) {
		this.productId = productId;
	}
	
	
	//problem : how many combinations for these 5 parameters such many constructors is bad design
	//to resolve this problem, we can use builder pattern
	
}
