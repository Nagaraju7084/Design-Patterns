package com.boot.design.patterns.creational.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class StripeGateway implements PaymentGateway {

	@Override
	public void processPayment(PaymentRequest paymentRequest) {
		System.out.println("stripegateway");
	}

}
