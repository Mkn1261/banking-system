package com.banking.transactionservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String senderAccountNumber;

    @Column(nullable = false, precision = 15, scale = 2)
    private String receiverAccountNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BigDecimal amount;

    private TransactionType type;

    private TransactionStatus status;

    private String description;

    private String failureReason;

    private String referenceNumber;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private LocalDateTime completedAt;

}
