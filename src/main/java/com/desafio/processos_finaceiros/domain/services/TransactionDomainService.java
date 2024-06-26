package com.desafio.processos_finaceiros.domain.services;

import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.request.TransactionCreateRequest;
import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.response.TransactionResponse;
import com.desafio.processos_finaceiros.domain.services.interfaces.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionDomainService implements TransactionService {

    @Override
    public TransactionResponse create(TransactionCreateRequest transactionCreateRequest) {
        try {
            return TransactionResponse.from(transactionCreateRequest.toEntity());

        } catch (Exception e) {
            throw new RuntimeException("Deu ruim");
        }
    }
}
