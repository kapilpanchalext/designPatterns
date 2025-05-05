package com.java.adaptor.sdk;

public class StripeApi {

	public void makePayment(String customerId, double amountInDollars, String currencyCode) {
		System.out.println("Stripe Payment Gateway Received: $" + amountInDollars + " " + currencyCode + " for customerId: " + customerId);
	}
}
