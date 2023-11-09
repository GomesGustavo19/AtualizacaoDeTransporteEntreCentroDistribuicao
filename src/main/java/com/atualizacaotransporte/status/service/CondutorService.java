package com.atualizacaotransporte.status.service;

import com.atualizacaotransporte.status.dto.mapper.CondutorMapper;
import com.atualizacaotransporte.status.dto.request.CondutorRequest;
import com.atualizacaotransporte.status.exception.CondutorException;
import com.atualizacaotransporte.status.exception.VeiculoException;
import com.atualizacaotransporte.status.model.Condutor;
import com.atualizacaotransporte.status.model.Veiculo;
import com.atualizacaotransporte.status.repository.CondutorRepository;
import com.atualizacaotransporte.status.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CondutorService {

    @Autowired
    private CondutorRepository repository;

    @Autowired
    private VeiculoService veiculoService;

    public ResponseEntity<List<Condutor>> buscar(String registro){

        if (registro.isBlank())
            throw new CondutorException("Digiete um registro valido");

        List<Condutor> condutorPesquisado = repository.findByRegistroCnh(registro).stream().toList();

        return new ResponseEntity<>(condutorPesquisado, HttpStatus.OK);

    }

    public ResponseEntity<Condutor> salvar(Condutor condutor) {

        List<Condutor> pesquisa = buscar(condutor.getRegistroCnh()).getBody();

        if (pesquisa.size() == 1)
            throw new CondutorException("Condutor ja cadastrado! " + condutor.getRegistroCnh());

        if (condutor.getVeiculo() == null) {
            condutor = repository.save(condutor);
            return new ResponseEntity<>(condutor, HttpStatus.CREATED);
        }

        Veiculo veiculoPesquisado = veiculoService.buscar(condutor.getPlaca()).getBody();

        condutor.setVeiculo(veiculoPesquisado);

        condutor = repository.save(condutor);

        return new ResponseEntity<>(condutor, HttpStatus.CREATED);

    }

    public ResponseEntity<Condutor> atualizar(Condutor condutor) {

        if (condutor.getPlaca() == null)
            throw new VeiculoException("Digite um placa valido");

        if (condutor.getId() == null)
            throw new CondutorException("Digite um condutor_id valido");


        Veiculo veiculoPesquisado = veiculoService.buscar(condutor.getPlaca()).getBody();

        if (condutor.getVeiculo().equals(veiculoPesquisado)) {
            buscar(condutor.getRegistroCnh()).getBody().stream().map(condutorAtualizado -> {
                condutorAtualizado.setNome(condutor.getNome());
                condutorAtualizado.setRegistroCnh(condutor.getRegistroCnh());
                condutorAtualizado.setVencCnh(condutor.getVencCnh());
                condutorAtualizado.setVencToxicologico(condutor.getVencToxicologico());
                condutorAtualizado.setVeiculo(veiculoPesquisado);
                Condutor update = repository.saveAndFlush(condutorAtualizado);
                return new ResponseEntity<>(update, HttpStatus.OK);

            });
        }else {
            buscar(condutor.getRegistroCnh()).getBody().stream().map(condutorAtualizado -> {
                condutorAtualizado.setNome(condutor.getNome());
                condutorAtualizado.setRegistroCnh(condutor.getRegistroCnh());
                condutorAtualizado.setVencCnh(condutor.getVencCnh());
                condutorAtualizado.setVencToxicologico(condutor.getVencToxicologico());
                Condutor update = repository.saveAndFlush(condutorAtualizado);
                return new ResponseEntity<>(update, HttpStatus.OK);

            });

        }

        return ResponseEntity.notFound().build();
    }
}
