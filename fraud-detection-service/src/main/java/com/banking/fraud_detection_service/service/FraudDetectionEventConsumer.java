package com.banking.fraud_detection_service.service;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FraudDetectionEventConsumer {


    public void consumeTransactionInitiated(
            @Payload Map<String, Object> payload){
        log.info("Received transaction for fraud check: {}",
                payload.get("transactionId"));

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
