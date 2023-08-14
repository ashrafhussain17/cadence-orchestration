package com.ashraf.mycadence;

public interface PaymentActivities {
    void processPayment(String paymentId);
    void cancelPayment(String paymentId);
}
