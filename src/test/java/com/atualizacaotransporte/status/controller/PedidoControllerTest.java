package com.atualizacaotransporte.status.controller;

import com.atualizacaotransporte.status.dto.request.PedidoRequest;
import com.atualizacaotransporte.status.model.Pedido;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoControllerTest {


    @Test
    void salvarPedido() {
        PedidoController controller = new PedidoController();
        Pedido pedido = new Pedido();
        PedidoRequest request = new PedidoRequest("3723620716");
        controller.salvarPedido(request);
        Integer id = 1;
        Integer obtido = pedido.getId();
        assertEquals(id, obtido);

    }
}