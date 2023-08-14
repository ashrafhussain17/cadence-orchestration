package com.ashraf.mycadence;

public class OrderWorkflowImpl implements OrderWorkflow {

    private final OrderActivities orderActivities;
    private final PaymentActivities paymentActivities;

    public OrderWorkflowImpl(OrderActivities orderActivities, PaymentActivities paymentActivities) {
        this.orderActivities = orderActivities;
        this.paymentActivities = paymentActivities;
    }

    @Override
    public void processOrder(String orderId, String paymentId) {
        orderActivities.createOrder(orderId);
        paymentActivities.processPayment(paymentId);
    }
}
