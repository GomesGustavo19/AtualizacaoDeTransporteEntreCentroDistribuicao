package com.atualizacaotransporte.status.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CondutorException extends RuntimeException{

    public CondutorException(String ex){super(ex);}
}
