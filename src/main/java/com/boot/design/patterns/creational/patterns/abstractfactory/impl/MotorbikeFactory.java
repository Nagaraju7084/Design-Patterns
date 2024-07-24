package com.boot.design.patterns.creational.patterns.abstractfactory.impl;

public class MotorbikeFactory implements VehicleFactory {
	
	public Vehicle create() {
		return new Motorbike();
	}
	
}
