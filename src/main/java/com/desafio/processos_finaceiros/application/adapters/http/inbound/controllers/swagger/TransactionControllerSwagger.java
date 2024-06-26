package com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.swagger;

import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.request.TransactionCreateRequest;
import com.desafio.processos_finaceiros.application.adapters.http.inbound.controllers.dto.response.TransactionResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/transactions", produces = {MediaType.APPLICATION_JSON_VALUE})
@Tag(name = "Transaction", description = "Operações referente a Transações")
public interface TransactionControllerSwagger {
    @ApiOperation(value = "Criação de uma transação")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Criado", response = TransactionResponse.class),
            @ApiResponse(code = 422, message = "Transação não processada"),
            @ApiResponse(code = 500, message = "Erro interno do servidor ou seviço.")
    })
    @PostMapping
    ResponseEntity<TransactionResponse> post(@RequestBody @Valid TransactionCreateRequest transactionRequest);

}
