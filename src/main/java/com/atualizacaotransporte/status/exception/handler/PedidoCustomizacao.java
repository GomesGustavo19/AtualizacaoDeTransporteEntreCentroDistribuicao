package com.atualizacaotransporte.status.exception.handler;

import com.atualizacaotransporte.status.exception.response.PedidoResponse;
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
public class PedidoCustomizacao extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<PedidoResponse> PedidoCadastradoException(Exception ex, WebRequest request){

        PedidoResponse pedidoResponse = new PedidoResponse(new Date(),ex.getMessage(),request.getDescription(false));

        return new ResponseEntity<>(pedidoResponse, HttpStatus.OK);

    }
}
