package com.atualizacaotransporte.status.dto.response;


public class PedidoResponse {

    private Integer id;
    private String numeroPedido;

    public PedidoResponse(Integer id, String numeroPedido) {
        this.id = id;
        this.numeroPedido = numeroPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
}
