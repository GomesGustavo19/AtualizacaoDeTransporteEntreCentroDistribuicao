package com.atualizacaotransporte.status.exception.handler;

import com.atualizacaotransporte.status.dto.response.CondutorResponse;
import com.atualizacaotransporte.status.exception.response.CondutoResponse;
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
public class CondutorCustomizacao extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public final ResponseEntity<CondutoResponse> CondutorException(Exception ex, WebRequest request){

        CondutoResponse response = new CondutoResponse(new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
