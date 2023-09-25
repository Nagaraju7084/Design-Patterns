package com.boot.design.patterns.creational.patterns.builder.problemwithoutbuilder;

public class TestBuilder {
	public static void main(String[] args) {
		ProductTwo p1 = new ProductTwo.Builder()
				.productId(10)
				.productName("iphone")
				.build();
		
		ProductTwo p2 = ProductTwo.builder()
				.productId(20)
				.build();
		
		User userOne = User.builder()
				.userId(10)
				.userName("userOne")
				.build();
	}
}
