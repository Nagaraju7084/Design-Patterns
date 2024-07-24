package com.boot.design.patterns.creational.patterns.abstractfactory.impl;

public interface VehicleFactory {
	Vehicle create();
	static VehicleFactory create(VehicleType type) {
		switch(type) {
		case CAR: return new CarFactory();
		case MOTORBIKE: return new MotorbikeFactory();
		}
		throw new IllegalArgumentException();
	}
	
	enum VehicleType{
		CAR, MOTORBIKE
	}
}
