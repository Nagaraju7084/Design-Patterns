package com.boot.design.patterns.creational.patterns.abstractfactory;

public class CarFactory {
	public static Vehicle create() {
		return new Car(); //it should not return always return only one implementation, it has to return different implementation based on the decision from the environment or parameter given to the method
	}
	
}
