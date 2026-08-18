package com.banking.fraud_detection_service.service;

import com.banking.fraud_detection_service.client.AccountServiceClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class FraudDetectionService {

    private final AccountServiceClient accountServiceClient;

    public void checkTransaction(Map<String, Object> payload){
        String transactionId = (String)payload.get("transactionId");
        String accountNumber = (String)payload.get("senderAccountNumber");
        BigDecimal amount= new BigDecimal(payload.get("amount").toString());


        // Fetch real balance from Account Service
        BigDecimal = senderBalance = accountServiceClient.getBalance(accountNumber);

        log.info("Checking transaction:{} account{} amount: {} balance: {}",
                transactionId, accountNumber, amount, senderBalance);

        performFraudChecks(accountNumber, amount, senderBalance);













    }

}
