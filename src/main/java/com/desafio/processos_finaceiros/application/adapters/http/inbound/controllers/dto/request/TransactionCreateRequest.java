package com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.request;

import com.desafio.processos_finaceiros.domain.entities.Transaction;
import com.desafio.processos_finaceiros.domain.enums.TransactionMethod;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import static com.desafio.processos_finaceiros.domain.exception.MessageErrorCodeConstants.FIELD_MAY_NOT_BE_NULL;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TransactionCreateRequest {

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private UUID merchantId;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private BigDecimal transactionValue;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private String description;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private TransactionMethod transactionMethod;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private int cardNumber;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private String cardName;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private Date expirationDate;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private String cvvCode;

    public Transaction toEntity() {
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(this, transaction);
        return transaction;
    }
}
