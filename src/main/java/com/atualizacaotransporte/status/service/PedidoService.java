package com.atualizacaotransporte.status.service;

import com.atualizacaotransporte.status.model.Pedido;
import com.atualizacaotransporte.status.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido salvar(String numeroPedido){

        Pedido p = new Pedido();
        p.setNumeroPedido(numeroPedido);

        return repository.save(p);

    }


}
