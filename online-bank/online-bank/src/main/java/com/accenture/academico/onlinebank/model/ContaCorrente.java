package com.accenture.academico.onlinebank.model;

import javax.persistence.*;

@Entity(name = "contacorrente")
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContaCorrente")
    @NotBlack("Campo não informado")
    private int idContaCorrente;

    @Column(name = "contaCorrenteAgencia")
    @NotBlack("Campo não informado")
    private String contaCorrenteAgencia;

    @Column(name = "contaCorrenteNumero")
    @NotBlack("Campo não informado")
    private String contaCorrenteNumero;

    @Column(name = "contaCorrenteSaldo")
    @NotBlack("Campo não informado")
    private double contaCorrenteSaldo;

    public ContaCorrente() {
    }

    public ContaCorrente(int idContaCorrente, String contaCorrenteAgencia, String contaCorrenteNumero, double contaCorrenteSaldo) {
        this.idContaCorrente = idContaCorrente;
        this.contaCorrenteAgencia = contaCorrenteAgencia;
        this.contaCorrenteNumero = contaCorrenteNumero;
        this.contaCorrenteSaldo = contaCorrenteSaldo;
    }

    public int getIdContaCorrente() {
        return idContaCorrente;
    }

    public void setIdContaCorrente(int idContaCorrente) {
        this.idContaCorrente = idContaCorrente;
    }

    public String getContaCorrenteAgencia() {
        return contaCorrenteAgencia;
    }

    public void setContaCorrenteAgencia(String contaCorrenteAgencia) {
        this.contaCorrenteAgencia = contaCorrenteAgencia;
    }

    public String getContaCorrenteNumero() {
        return contaCorrenteNumero;
    }

    public void setContaCorrenteNumero(String contaCorrenteNumero) {
        this.contaCorrenteNumero = contaCorrenteNumero;
    }

    public double getContaCorrenteSaldo() {
        return contaCorrenteSaldo;
    }

    public void setContaCorrenteSaldo(double contaCorrenteSaldo) {
        this.contaCorrenteSaldo = contaCorrenteSaldo;
    }
}
