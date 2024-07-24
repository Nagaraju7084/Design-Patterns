package com.boot.design.patterns.creational.patterns.abstractfactory.impl;

public class Main {
	public static void main(String[] args) {
		VehicleFactory factory1  = VehicleFactory.create(VehicleFactory.VehicleType.CAR);
		Vehicle v1 = factory1.create();
		System.out.println(v1.getClass());
		
		VehicleFactory factory2 = VehicleFactory.create(VehicleFactory.VehicleType.MOTORBIKE);
		Vehicle v2 = factory2.create();
		System.out.println(v2.getClass());
	}
}
