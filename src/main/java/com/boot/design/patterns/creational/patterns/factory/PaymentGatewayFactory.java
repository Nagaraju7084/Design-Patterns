package com.boot.design.patterns.creational.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayFactory {
	private final PayPalGateway payPalGateway;
	private final StripeGateway stripeGateway;
	public PaymentGatewayFactory(PayPalGateway payPalGateway, StripeGateway stripeGateway) {
		super();
		this.payPalGateway = payPalGateway;
		this.stripeGateway = stripeGateway;
	}
	
	public PaymentGateway createPaymentGateway(String gatewayType) {
		if(gatewayType.equalsIgnoreCase("paypal")) {
			return payPalGateway;
		}else if(gatewayType.equalsIgnoreCase("stripe")) {
			return stripeGateway;
		}else {
			throw new IllegalArgumentException("Invalid Gateway Type");
		}
	}
}
