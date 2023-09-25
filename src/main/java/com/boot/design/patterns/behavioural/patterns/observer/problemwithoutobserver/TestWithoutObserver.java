package com.boot.design.patterns.behavioural.patterns.observer.problemwithoutobserver;

public class TestWithoutObserver {
	public static void main(String[] args) {
		PaymentManager paymentManager = new PaymentManager();
		paymentManager.pay();
	}
}


//problems
//1. tight coupling
//2. when pay method called, event manager and notificat manager both are called but we want some times logs, some times notifications
//some times both