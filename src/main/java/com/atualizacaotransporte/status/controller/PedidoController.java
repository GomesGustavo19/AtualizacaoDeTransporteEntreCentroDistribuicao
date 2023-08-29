package com.atualizacaotransporte.status.controller;

import com.atualizacaotransporte.status.dto.mapper.PedidoMapper;
import com.atualizacaotransporte.status.dto.request.PedidoAtualizacaoRequest;
import com.atualizacaotransporte.status.dto.request.PedidoRequest;
import com.atualizacaotransporte.status.dto.response.PedidoResponse;
import com.atualizacaotransporte.status.model.Pedido;
import com.atualizacaotransporte.status.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
    @Autowired
    private PedidoService service;

    @PostMapping
    public ResponseEntity<PedidoResponse> salvarPedido(@RequestBody PedidoRequest request) {
        Pedido pedido = PedidoMapper.toPedido(request);
        Pedido pedidoSalvo = service.salvar(pedido.getNumeroPedido()).getBody();
        PedidoResponse response = PedidoMapper.toPedidoResponse(pedidoSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<PedidoResponse>> buscarPedido(@RequestBody PedidoRequest request) {
        List<Pedido> buscarPedido = service.buscarPedido(request.getNumeroPedido()).getBody();
        List<PedidoResponse> response = PedidoMapper.toPedidoListado(buscarPedido);

        return ResponseEntity.status(HttpStatus.OK).body(response);

    }

    @PutMapping
    public ResponseEntity<PedidoResponse> atualizarPedido(@RequestBody PedidoAtualizacaoRequest request) {
        Pedido pedidoAtualizado = service.atualizar(request).getBody();
        PedidoResponse response = PedidoMapper.toPedidoResponse(pedidoAtualizado);

        return ResponseEntity.status(HttpStatus.OK).body(response);

    }

}
