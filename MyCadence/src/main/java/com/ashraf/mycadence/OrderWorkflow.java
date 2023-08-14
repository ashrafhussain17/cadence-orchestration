package com.ashraf.mycadence;

import com.uber.cadence.workflow.WorkflowMethod;

public interface OrderWorkflow {
    @WorkflowMethod
    void processOrder(String orderId, String paymentId);
}
