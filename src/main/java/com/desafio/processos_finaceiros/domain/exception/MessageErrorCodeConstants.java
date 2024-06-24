package com.desafio.processos_finaceiros.domain.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageErrorCodeConstants {

    public static final String INVALID_REQUEST = "400.000";
    public static final String FIELD_INVALID = "400.001";
    public static final String FIELD_MAY_NOT_BE_NULL = "400.002";
    public static final String INVALID_ATTACKPOINT_FIELD = "400.003";
    public static final String INTERNAL_SERVER_ERROR = "500.000";

}
