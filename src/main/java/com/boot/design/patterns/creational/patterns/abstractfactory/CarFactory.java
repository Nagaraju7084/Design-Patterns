package com.boot.design.patterns.creational.patterns.abstractfactory;

public class CarFactory {

	public static Vehicle create(CarType carType) {
		switch(carType) {
		case BMW: return new BMW();
		case AUDI: return new Audi();
		}
		throw new IllegalArgumentException();
	}
	
	public enum CarType{
		BMW, AUDI;
	}
}