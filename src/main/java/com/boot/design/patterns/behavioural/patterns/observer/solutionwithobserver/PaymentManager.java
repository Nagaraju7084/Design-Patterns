package com.boot.design.patterns.behavioural.patterns.observer.solutionwithobserver;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {
	private final List<PaymentListener> listOfpaymentListeners = new ArrayList<>();
	
	public void pay() {
		//listOfpaymentListeners.forEach(payment -> System.out.println("payment has bee done"));
		listOfpaymentListeners.forEach(PaymentListener::paymentMade);
	}
	
	public void registerListener(PaymentListener paymentListener) {
		listOfpaymentListeners.add(paymentListener);
	}
	
	public void unregisterListener(PaymentListener paymentListener) {
		listOfpaymentListeners.remove(paymentListener);
	}
}
