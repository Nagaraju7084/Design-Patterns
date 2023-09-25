package com.boot.design.patterns.behavioural.patterns.observer.solutionwithobserver;

public class PaymentEventLogger implements PaymentListener {

	@Override
	public void paymentMade() {
		System.out.println("payment received");
	}

}
