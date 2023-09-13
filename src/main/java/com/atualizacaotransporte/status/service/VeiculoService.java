package com.atualizacaotransporte.status.service;

import com.atualizacaotransporte.status.dto.mapper.VeiculoMapper;
import com.atualizacaotransporte.status.exception.VeiculoException;
import com.atualizacaotransporte.status.model.Veiculo;
import com.atualizacaotransporte.status.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public ResponseEntity<List<Veiculo>> buscar(String placa) {

        List<Veiculo> veiculoPesquisado = repository.findByPlaca(placa);

        if (veiculoPesquisado.size() == 0)
            throw new VeiculoException("Veiculo não cadastrado: " + placa);

        return new ResponseEntity<List<Veiculo>>(veiculoPesquisado, HttpStatus.OK);

    }

    public ResponseEntity<Veiculo> salvar(Veiculo veiculoRequest) {

        List<Veiculo> pesquisaVeiculo = repository.findByPlaca(veiculoRequest.getPlaca());

        if (pesquisaVeiculo.size() == 1) {
            throw new VeiculoException("Veiculo ja cadastrado: " + veiculoRequest.getPlaca().toUpperCase());
        } else {
            veiculoRequest = repository.save(veiculoRequest);
        }

        return new ResponseEntity<Veiculo>(veiculoRequest, HttpStatus.CREATED);

    }

    public ResponseEntity<Veiculo> atualizar(Veiculo veiculo) {
        Veiculo modelo = new Veiculo();
        modelo.setId(veiculo.getId());

        if (modelo.getId() == null)
            throw new VeiculoException("Digite um id valido para atualizado o veiculo: " + modelo.getId());

        return repository.findById(modelo.getId()).map(atualizado -> {
            atualizado.setLicenciamento(veiculo.getLicenciamento());
            Veiculo update = repository.save(atualizado);
            return new ResponseEntity<Veiculo>(update, HttpStatus.OK);
        }).orElse(ResponseEntity.notFound().build());

    }
}
