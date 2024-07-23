package com.boot.design.patterns.creational.patterns.abstractfactory;

public class Main {

	public static void main(String[] args) {
		Vehicle c1 = CarFactory.create();
		System.out.println(c1);
	}

}
