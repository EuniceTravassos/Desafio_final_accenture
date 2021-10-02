package com.accenture.academico.onlinebank.Enums;

public enum Operacao {

    SAQUE("Saque"),
    DEPOSITO("Deposito"),
    TRANSFERENCIA("Transferencia");

    private String descricao;

    Operacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
