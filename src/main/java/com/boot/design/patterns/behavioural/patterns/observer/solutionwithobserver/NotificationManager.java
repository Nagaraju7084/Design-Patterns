package com.boot.design.patterns.behavioural.patterns.observer.solutionwithobserver;

public class NotificationManager implements PaymentListener{

	@Override
	public void paymentMade() {
		System.out.println("notification sent");
	}
	
}
