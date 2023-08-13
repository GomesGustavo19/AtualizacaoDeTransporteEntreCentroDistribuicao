package com.atualizacaotransporte.status.controller;

import com.atualizacaotransporte.status.dto.mapper.PedidoMapper;
import com.atualizacaotransporte.status.dto.request.PedidoRequest;
import com.atualizacaotransporte.status.model.Pedido;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PedidoControllerTest {

    @Autowired
    private PedidoController controller;

    Pedido pedido = new Pedido();

    @Test
    void salvarPedido() {
        PedidoRequest request = new PedidoRequest("3723620716");
        controller.salvarPedido(request);
        Integer id = 1;
        Integer obtido = pedido.getId();
        assertEquals(id, obtido);

    }
}