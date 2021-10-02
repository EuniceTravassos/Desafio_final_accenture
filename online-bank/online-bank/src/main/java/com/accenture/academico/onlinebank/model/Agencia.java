package com.accenture.academico.onlinebank.model;

import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "agencia")
public class Agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAgencia")
    private int idAgencia;

    @NotNull
    @Column(name = "nomeAgencia")
    private String nomeAgencia;

    @NotNull
    @Column(name = "endereco")
    private String endereco;

    @NotNull
    @Column(name = "telefone")
    private String telefone;


    public Agencia() {
    }

    public Agencia(int idAgencia, String nomeAgencia, String endereco, String telefone) {
        this.idAgencia = idAgencia;
        this.nomeAgencia = nomeAgencia;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
