package com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.response;

import com.desafio.processos_finaceiros.domain.entities.Transaction;
import com.desafio.processos_finaceiros.domain.enums.TransactionMethod;
import com.desafio.processos_finaceiros.domain.enums.TransactionStatus;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import static com.desafio.processos_finaceiros.domain.exception.MessageErrorCodeConstants.FIELD_MAY_NOT_BE_NULL;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TransactionResponse {

    private UUID id;

    private UUID merchantId;

    private BigDecimal transactionValue;

    private Double finalValue;

    private TransactionMethod transactionMethod;

    private TransactionStatus transactionStatus;

    private int cardNumber;

    private String cardName;

    private LocalDateTime paymentDate;


    public static TransactionResponse from(final Transaction transaction) {
        TransactionResponse transactionResponse = new TransactionResponse();
        BeanUtils.copyProperties(transaction, transactionResponse);
        return transactionResponse;
    }



}
