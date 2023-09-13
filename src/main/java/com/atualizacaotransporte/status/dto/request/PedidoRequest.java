package com.atualizacaotransporte.status.dto.request;

public class PedidoRequest {

    private String numeroPedido;

    public PedidoRequest() {
    }

    public PedidoRequest(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

}
