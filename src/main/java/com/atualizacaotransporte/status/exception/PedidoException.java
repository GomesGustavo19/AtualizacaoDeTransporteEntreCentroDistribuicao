package com.atualizacaotransporte.status.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class PedidoException extends RuntimeException{
    public PedidoException(String ex){super(ex);};
}
