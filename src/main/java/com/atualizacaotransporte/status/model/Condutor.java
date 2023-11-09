package com.atualizacaotransporte.status.model;

import com.atualizacaotransporte.status.validation.constrains.PlacaCarro;
import com.atualizacaotransporte.status.validation.constrains.RegistroCnh;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Condutor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @RegistroCnh
    private String registroCnh;
    @Temporal(TemporalType.DATE)
    private Date vencCnh;
    @Temporal(TemporalType.DATE)
    private Date vencToxicologico;
    @OneToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;
    @Pattern(regexp = "[A-Z]{3}[0-9][0-9A-Z][0-9]{2}")
    private String placa;

    @Deprecated
    public Condutor() {
    }

    public Condutor(String nome, String registroCnh, Date vencCnh, Date vencToxicologico, Veiculo veiculo) {
        this.nome = nome;
        this.registroCnh = registroCnh;
        this.vencCnh = vencCnh;
        this.vencToxicologico = vencToxicologico;
        this.veiculo = veiculo;
    }

    public Condutor(Integer id, String nome, String registroCnh, Date vencCnh, Date vencToxicologico) {
        this.id = id;
        this.nome = nome;
        this.registroCnh = registroCnh;
        this.vencCnh = vencCnh;
        this.vencToxicologico = vencToxicologico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroCnh() {
        return registroCnh;
    }

    public void setRegistroCnh(String registroCnh) {
        this.registroCnh = registroCnh;
    }

    public Date getVencCnh() {
        return vencCnh;
    }

    public void setVencCnh(Date vencCnh) {
        this.vencCnh = vencCnh;
    }

    public Date getVencToxicologico() {
        return vencToxicologico;
    }

    public void setVencToxicologico(Date vencToxicologico) {
        this.vencToxicologico = vencToxicologico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
