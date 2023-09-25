package com.boot.design.patterns.behavioural.patterns.observer.problemwithoutobserver;

public class PaymentManager {
	
	private final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();
	private final NotificationManager notificationManager = new NotificationManager();
	
	public void pay() {
		System.out.println("payment has been done");
		paymentEventLogger.logEvent();
		notificationManager.sendNotification();
	}
}
