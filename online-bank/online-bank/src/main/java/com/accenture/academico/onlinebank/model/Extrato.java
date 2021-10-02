package com.accenture.academico.onlinebank.model;

import com.accenture.academico.onlinebank.Enums.Operacao;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Extrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdExtrato;

    @NotNull
    private Operacao operacao;

    @NotNull
    private double valorOperacao;

    @NotNull
    @ManyToOne
    private ContaCorrente contaCorrente;

    public Extrato() {

    }

    public Extrato(int idExtrato, @NotNull Operacao operacao, @NotNull double valorOperacao, @NotNull ContaCorrente contaCorrente) {
        IdExtrato = idExtrato;
        this.operacao = operacao;
        this.valorOperacao = valorOperacao;
        this.contaCorrente = contaCorrente;
    }

    public int getIdExtrato() {
        return IdExtrato;
    }

    public void setIdExtrato(int idExtrato) {
        IdExtrato = idExtrato;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
