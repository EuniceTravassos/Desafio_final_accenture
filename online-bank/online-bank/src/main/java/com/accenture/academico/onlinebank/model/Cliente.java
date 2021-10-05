package com.accenture.academico.onlinebank.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    @NotBlack("Campo não informado")
    private int idCliente;

    @NotNull
    @Column(name = "clienteNome")
    @NotBlack("Campo não informado")
    @Pattern(regexp ="[A-Z]+(.)*")
    private String clienteNome;

    @NotNull
    @Column(name = "clienteCpf")
    @NotBlack("Campo não informado")
    @CPF
    private String clienteCpf;

    @NotNull
    @Column(name = "clienteFone")
    @NotBlack("Campo não informado")
    private String clienteFone;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    private List<ContaCorrente> contaCorrentes;

    @NotNull
    @ManyToOne
    @NotBlack("Campo não informado")
    private Agencia agencia;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Extrato> extratos;

    public Cliente() {
    }

    public Cliente(int idCliente, @NotNull String clienteNome, @NotNull String clienteCpf, @NotNull String clienteFone, @NotNull List<ContaCorrente> contaCorrentes, @NotNull Agencia agencia, @NotNull List<Extrato> extratos) {
        this.idCliente = idCliente;
        this.clienteNome = clienteNome;
        this.clienteCpf = clienteCpf;
        this.clienteFone = clienteFone;
        this.contaCorrentes = contaCorrentes;
        this.agencia = agencia;
        this.extratos = extratos;
        //this.transferencia = tranferencia;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getClienteFone() {
        return clienteFone;
    }

    public void setClienteFone(String clienteFone) {
        this.clienteFone = clienteFone;
    }

    public List<ContaCorrente> getContaCorrentes() {
        return contaCorrentes;
    }

    public void setContaCorrentes(List<ContaCorrente> contaCorrentes) {
        this.contaCorrentes = contaCorrentes;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public List<Extrato> getExtratos() {
        return extratos;
    }

    public void setExtratos(List<Extrato> extratos) {
        this.extratos = extratos;
    }
}
