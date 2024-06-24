package com.desafio.processos_finaceiros.domain.entities;

import com.desafio.processos_finaceiros.domain.enums.TransactionMethod;
import com.desafio.processos_finaceiros.domain.enums.TransactionStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    private String id;


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

    private LocalDateTime paymentDate;

    private Double finalValue;

    private TransactionStatus transactionStatus;


}
