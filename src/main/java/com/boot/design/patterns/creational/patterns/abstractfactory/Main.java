package com.boot.design.patterns.creational.patterns.abstractfactory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Vehicle c1 = CarFactory.create(CarFactory.CarType.AUDI);
		System.out.println(c1);
		Vehicle c2 = CarFactory.create(CarFactory.CarType.BMW);
		System.out.println(c2);
	}
	
	//example of factory method
	LocalDateTime localDateTime = LocalDateTime.now(); //factory method
	Path paths = Paths.get("c:/abc"); //factory method

}
