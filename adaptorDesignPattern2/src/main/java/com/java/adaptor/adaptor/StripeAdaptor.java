package com.java.adaptor.adaptor;

import com.java.adaptor.model.PaymentRequest;
import com.java.adaptor.sdk.StripeApi;

public class StripeAdaptor {
	private final StripeApi stripeApi;

	public StripeAdaptor() {
		this.stripeApi = new StripeApi();
	}

	public void processPayment(PaymentRequest request) {
		stripeApi.makePayment(request.getUserId(), request.getAmount(), request.getCurrency());
	}
}
