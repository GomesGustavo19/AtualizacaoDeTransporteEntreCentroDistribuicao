package com.atualizacaotransporte.status.exception.response;

import java.io.Serializable;
import java.util.Date;

public class VeiculoResponseException implements Serializable {

    private Date data;
    private String mensagem;
    private String descricao;

    public VeiculoResponseException(Date data, String mensagem, String descricao) {
        this.data = data;
        this.mensagem = mensagem;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
