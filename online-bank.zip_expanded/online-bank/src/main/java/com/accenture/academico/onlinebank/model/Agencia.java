package com.accenture.academico.onlinebank.model;


import javax.persistence.*;

@Entity(name = "agencia")
public class Agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgencia;
    private String nomeAgencia;


    public Agencia() {
    }

    public Agencia(int idAgencia, String nomeAgencia) {
        this.idAgencia = idAgencia;
        this.nomeAgencia = nomeAgencia;
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

}
