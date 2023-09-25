package com.boot.design.patterns.creational.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class PayPalGateway implements PaymentGateway {

	@Override
	public void processPayment(PaymentRequest paymentRequest) {
		System.out.println("paypalgateway");
	}

}
