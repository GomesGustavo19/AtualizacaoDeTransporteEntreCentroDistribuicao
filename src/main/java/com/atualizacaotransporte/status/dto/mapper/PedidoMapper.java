package com.atualizacaotransporte.status.dto.mapper;

import com.atualizacaotransporte.status.dto.request.PedidoRequest;
import com.atualizacaotransporte.status.dto.response.PedidoResponse;
import com.atualizacaotransporte.status.model.Pedido;

public class PedidoMapper {


    public static Pedido toPedido(PedidoRequest request){
        Pedido pedido = new Pedido();

        pedido.setNumeroPedido(request.numeroPedido());

        return pedido;
    }

    public static PedidoResponse toPedidoResponse(Pedido pedido){
        PedidoResponse response = new PedidoResponse(pedido.getId(), pedido.getNumeroPedido());

        return response;
    }

}
