package com.boot.design.patterns.creational.patterns.abstractfactory;

public class CarFactory {
	public static Vehicle create() {
		return new Car();
	}
}
