package com.pruebatecnica.jose.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class Respuesta<E>{

    private final HttpStatus status;
    private final String message;
    private final E payload;

}
