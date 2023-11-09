package com.atualizacaotransporte.status.repository;

import com.atualizacaotransporte.status.model.Condutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CondutorRepository extends JpaRepository<Condutor,Integer> {
    Optional<Condutor> findByRegistroCnh(String registroCnh);
}

