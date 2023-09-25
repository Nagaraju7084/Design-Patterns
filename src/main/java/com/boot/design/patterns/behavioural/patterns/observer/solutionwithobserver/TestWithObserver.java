package com.boot.design.patterns.behavioural.patterns.observer.solutionwithobserver;

public class TestWithObserver {
	public static void main(String[] args) {
		PaymentManager paymentManager = new PaymentManager();
		PaymentListener eventLogger = new PaymentEventLogger();
		paymentManager.registerListener(eventLogger);
		PaymentListener notificationManager = new NotificationManager();
		paymentManager.registerListener(notificationManager);
		paymentManager.pay(); // two are register here
	}
}
