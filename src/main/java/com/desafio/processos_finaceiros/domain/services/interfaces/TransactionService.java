package com.desafio.processos_finaceiros.domain.services.interfaces;

import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.request.TransactionCreateRequest;
import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.response.TransactionResponse;

public interface TransactionService {

    TransactionResponse create(TransactionCreateRequest transactionCreateRequest);
}
