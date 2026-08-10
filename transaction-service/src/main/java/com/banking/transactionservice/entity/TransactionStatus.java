package com.banking.transactionservice.entity;


/**
 * Transaction life cycle flow
 *
 * PENDING -> PROCESSING -> COMPLETED (clean transaction)
 *                       -> PENDING_VERIFICATION(suspicious detected)
 *                                  ->COMPLETED(verified)
 *                                  ->FLAGED (SAGA REFUND)
 *                       ->FAILED
 *                       ->FLAGED
 *
 */
public enum TransactionStatus {

    PENDING,
    PROCESSING,
    PENDING_VERIFICATION,
    COMPLETED,
    FAILED,
    FLAGGED
}
