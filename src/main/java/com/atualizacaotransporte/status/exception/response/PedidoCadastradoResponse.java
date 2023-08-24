package com.atualizacaotransporte.status.exception.response;

import java.io.Serializable;
import java.util.Date;

public class PedidoCadastradoResponse implements Serializable {

    private Date date;
    private String message;
    private String description;

    public PedidoCadastradoResponse(Date date, String message, String description) {
        this.date = date;
        this.message = message;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
