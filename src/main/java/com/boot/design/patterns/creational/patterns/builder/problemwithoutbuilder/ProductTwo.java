package com.boot.design.patterns.creational.patterns.builder.problemwithoutbuilder;

import java.math.BigDecimal;

public class ProductTwo {
	
	private int productId;
	private String productName;
	private BigDecimal productPrice;
	private String productColor;
	
	public static class Builder{
		private ProductTwo productTwo = new ProductTwo();
		
		public Builder productId(int productId) {
			productTwo.productId = productId;
			return this;
		}
		
		public Builder productName(String productName) {
			productTwo.productName = productName;
			return this;
		}
		
		public Builder productPrice(BigDecimal productPrice) {
			productTwo.productPrice = productPrice;
			return this;
		}
		
		public Builder productColor(String productColor) {
			productTwo.productColor = productColor;
			return this;
		}
		
		public ProductTwo build() {
			return productTwo;
		}
	}
	
	public static Builder builder() {
		return new Builder();
	}
}
