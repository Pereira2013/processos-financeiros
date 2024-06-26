package com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers;

import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.request.TransactionCreateRequest;
import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.response.TransactionResponse;
import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.swagger.TransactionControllerSwagger;
import com.desafio.processos_finaceiros.domain.services.interfaces.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TransactionController implements TransactionControllerSwagger {

    private final TransactionService transactionService;

    @Override
    public ResponseEntity<TransactionResponse> post(TransactionCreateRequest transactionRequest) {
        var transactionResponse = transactionService.create(transactionRequest);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(transactionResponse);
    }
}
