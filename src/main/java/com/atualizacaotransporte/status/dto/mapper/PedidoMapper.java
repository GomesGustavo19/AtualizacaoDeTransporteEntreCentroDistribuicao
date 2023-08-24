package com.atualizacaotransporte.status.dto.mapper;

import com.atualizacaotransporte.status.dto.request.PedidoAtualizacaoRequest;
import com.atualizacaotransporte.status.dto.request.PedidoRequest;
import com.atualizacaotransporte.status.dto.response.PedidoResponse;
import com.atualizacaotransporte.status.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoMapper {


    public static Pedido toPedido(PedidoRequest request){
        Pedido pedido = new Pedido();

        pedido.setNumeroPedido(request.getNumeroPedido());

        return pedido;
    }

    public static PedidoResponse toPedidoResponse(Pedido pedido){
        PedidoResponse response = new PedidoResponse(pedido.getId(), pedido.getNumeroPedido());

        return response;
    }

    public static List<PedidoResponse> toPedidoListado(List<Pedido> pedidoListado) {
        List<PedidoResponse> responseList = new ArrayList<>();

        for (Pedido model : pedidoListado){
            PedidoResponse response = toPedidoResponse(model);
            responseList.add(response);
        }

        return responseList;

    }

    public static Pedido toPedidoAtualizacao(PedidoAtualizacaoRequest request){

        Pedido pedido = new Pedido(request.getId(),request.getNumeroPedido());

        return pedido;


    }
}
