package com.example.app.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    // Stripe secret key hardcoded in Java
    private final String STRIPE_SECRET_KEY = "sk_test_51MN1gqKbYqT8bJw9XyZ1aBc3dE4fG6h7I8j9K0l1M2N3O4P5Q6rS7tU8vW9x0Y1Z2";
    
    // PayPal client secret
    private final String PAYPAL_CLIENT_SECRET = "EC1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public void processPayment() {
        // Another API key in method
        String paymentGatewayKey = "pg_live_7a8b9c0d1e2f3g4h5i6j7k8l9m0n1o2p3";
        // ...
    }
}