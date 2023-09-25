package com.boot.design.patterns.creational.patterns.factory;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	private final PaymentGatewayFactory paymentGatewayFactory;

	public PaymentService(PaymentGatewayFactory paymentGatewayFactory) {
		super();
		this.paymentGatewayFactory = paymentGatewayFactory;
	}
	
	public void processPayment(PaymentRequest paymentRequest, String gatewayType) {
		PaymentGateway paymentGateway = paymentGatewayFactory.createPaymentGateway(gatewayType);
		paymentGateway.processPayment(paymentRequest);
	}
}
