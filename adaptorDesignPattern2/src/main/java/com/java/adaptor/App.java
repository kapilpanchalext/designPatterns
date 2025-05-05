package com.java.adaptor;

import com.java.adaptor.adaptor.StripeAdaptor;
import com.java.adaptor.model.PaymentRequest;

public class App {
    public static void main(String[] args) {
        System.out.println("Adaptor Pattern Payments Service!");
        
        PaymentRequest request = new PaymentRequest("user123", 150, "AUD");
        StripeAdaptor adaptor = new StripeAdaptor();
        adaptor.processPayment(request);
    }
}
