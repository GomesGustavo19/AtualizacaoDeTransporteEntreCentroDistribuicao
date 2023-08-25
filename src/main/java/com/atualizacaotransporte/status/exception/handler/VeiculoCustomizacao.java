package com.atualizacaotransporte.status.exception.handler;

import com.atualizacaotransporte.status.exception.response.VeiculoResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class VeiculoCustomizacao extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<VeiculoResponseException> VeiculoResponseException(Exception ex, WebRequest request){

        VeiculoResponseException responseException = new VeiculoResponseException(new Date(),ex.getMessage(),request.getDescription(false));

        return new ResponseEntity<VeiculoResponseException>(responseException, HttpStatus.OK);

    }

}
