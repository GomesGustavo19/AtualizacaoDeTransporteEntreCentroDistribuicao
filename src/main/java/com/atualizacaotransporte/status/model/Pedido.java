package com.atualizacaotransporte.status.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroPedido;

    @Deprecated
    public Pedido() {
    }

    public Pedido(int id, String numeroPedido) {
        this.id = id;
        this.numeroPedido = numeroPedido;
    }

    public int getId() {
        return id;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
}
