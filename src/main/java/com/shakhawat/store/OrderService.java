package com.shakhawat.store;

public class OrderService {
    public void placeOrder() {
        PaymentService paymentService = new StripePaymentService();
        paymentService.processPayment(100.0);
    }   
}
