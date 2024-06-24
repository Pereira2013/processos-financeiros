package com.desafio.processos_finaceiros.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transaction")
public class Transaction {
    @Id
    private UUID merchantId;

    private Double transactionValue;

    private String description;

    private String payamentMethod;

    private int cardNumber;

    private String cardName;

    private Date expirationDate;

    private Byte cvvCode;



}
