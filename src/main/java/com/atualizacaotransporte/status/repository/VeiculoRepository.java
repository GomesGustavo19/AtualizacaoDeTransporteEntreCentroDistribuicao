package com.atualizacaotransporte.status.repository;

import com.atualizacaotransporte.status.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Integer> {

    List<Veiculo> findByPlaca(String placa);
}
