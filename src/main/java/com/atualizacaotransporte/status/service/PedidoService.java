package com.atualizacaotransporte.status.service;

import com.atualizacaotransporte.status.dto.request.PedidoAtualizacaoRequest;
import com.atualizacaotransporte.status.exception.PedidoException;
import com.atualizacaotransporte.status.model.Pedido;
import com.atualizacaotransporte.status.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;


    public ResponseEntity<List<Pedido>> buscarPedido(String numeroPedido) {
        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(numeroPedido);

        if (pedido.getNumeroPedido() == null || pedido.getNumeroPedido().isBlank()) {
            throw new PedidoException("Digite o numero do pedido!");
        }

        List<Pedido> pedidoListado = repository.findByNumeroPedido(pedido.getNumeroPedido());

        if (pedidoListado.size() == 0)
            throw new PedidoException("Pedido não cadastrado");

        return new ResponseEntity<>(pedidoListado, HttpStatus.OK);

    }

    public ResponseEntity<Pedido> salvar(String numeroPedido) {

        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(numeroPedido);

        List<Pedido> pedidoListado = repository.findByNumeroPedido(pedido.getNumeroPedido());

        if (pedidoListado.size() == 1) {
            throw new PedidoException("Pedido Já Cadastrado");
        } else {
            pedido = repository.save(pedido);
        }

        return new ResponseEntity<Pedido>(pedido, HttpStatus.CREATED);

    }

    public ResponseEntity<Pedido> atualizar(PedidoAtualizacaoRequest request) {

        Pedido pedido = new Pedido();
        pedido.setId(request.getId());
        pedido.setNumeroPedido(request.getNumeroPedido());

        List<Pedido> pedidoList = buscarPedido(request.getNumeroIncorreto()).getBody();

        if (pedidoList.equals(pedido.getNumeroPedido())) {
            throw new PedidoException("Pedido já cadastrado ");
        }

        Pedido pedidoAtualizado = repository.saveAndFlush(pedido);

        return new ResponseEntity<Pedido>(pedidoAtualizado, HttpStatus.OK);

    }

}
