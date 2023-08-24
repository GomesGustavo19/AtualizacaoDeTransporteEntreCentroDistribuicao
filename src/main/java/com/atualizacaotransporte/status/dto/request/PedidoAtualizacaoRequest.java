package com.atualizacaotransporte.status.dto.request;

public class PedidoAtualizacaoRequest {

    private Integer id;

    private String numeroPedido;

    private String numeroIncorreto;

    public PedidoAtualizacaoRequest(Integer id, String numeroPedido, String numeroIncorreto) {
        this.numeroPedido = numeroPedido;
        this.id = id;
        this.numeroIncorreto = numeroIncorreto;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public Integer getId() {
        return id;
    }

    public String getNumeroIncorreto() {
        return numeroIncorreto;
    }
}
