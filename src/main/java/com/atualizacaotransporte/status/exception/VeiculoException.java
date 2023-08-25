package com.atualizacaotransporte.status.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class VeiculoException extends RuntimeException{

    public VeiculoException(String ex){super(ex);}
}
