package com.atualizacaotransporte.status.controller;

import com.atualizacaotransporte.status.dto.mapper.PedidoMapper;
import com.atualizacaotransporte.status.dto.request.PedidoRequest;
import com.atualizacaotransporte.status.dto.response.PedidoResponse;
import com.atualizacaotransporte.status.model.Pedido;
import com.atualizacaotransporte.status.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PedidoController {

   @Autowired
    private PedidoService service;

    public PedidoResponse salvarPedido(PedidoRequest request){
        Pedido pedido = PedidoMapper.toPedido(request);
        Pedido pedidoSalvo = service.salvar(String.valueOf(pedido));
        PedidoResponse response = PedidoMapper.toPedidoResponse(pedidoSalvo);
        return response;
    }

}
