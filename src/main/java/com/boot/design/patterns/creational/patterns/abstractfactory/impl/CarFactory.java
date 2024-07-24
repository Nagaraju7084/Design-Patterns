package com.boot.design.patterns.creational.patterns.abstractfactory.impl;

public class CarFactory implements VehicleFactory {
	
	public Vehicle create() {
		return new Car();
	}
	
}
