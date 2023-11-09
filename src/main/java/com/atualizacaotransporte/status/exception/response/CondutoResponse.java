package com.atualizacaotransporte.status.exception.response;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class CondutoResponse {

    private Date date;
    private String message;
    private String desctricao;

    public CondutoResponse(Date date, String message, String desctricao) {
        this.date = date;
        this.message = message;
        this.desctricao = desctricao;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDesctricao() {
        return desctricao;
    }

    public void setDesctricao(String desctricao) {
        this.desctricao = desctricao;
    }
}
