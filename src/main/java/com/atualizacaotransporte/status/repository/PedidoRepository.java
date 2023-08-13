package com.atualizacaotransporte.status.repository;

import com.atualizacaotransporte.status.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {
}
