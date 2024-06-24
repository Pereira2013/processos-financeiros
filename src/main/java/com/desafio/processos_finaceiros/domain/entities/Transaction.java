package com.desafio.processos_finaceiros.domain.entities;

import com.desafio.processos_finaceiros.domain.enums.Method;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

import static com.desafio.processos_finaceiros.domain.exception.MessageErrorCodeConstants.FIELD_MAY_NOT_BE_NULL;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transaction")
public class Transaction {
    @Id
    private UUID merchantId;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private Double transactionValue;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private String description;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private Method payamentMethod;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private int cardNumber;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private String cardName;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private Date expirationDate;

    @NotEmpty(message = FIELD_MAY_NOT_BE_NULL)
    private Byte cvvCode;



}
