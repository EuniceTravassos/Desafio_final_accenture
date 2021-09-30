package com.accenture.academico.onlinebank.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private int idCliente;
    @NotNull
    @Column(name = "clienteNome")
    private String clienteNome;
    @NotNull
    @Column(name = "clienteCpf")
    private String clienteCpf;
    @NotNull
    @Column(name = "clienteFone")
    private String clienteFone;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Agencia> agencias;

    public Cliente() {
    }

    public Cliente(int idCliente, @NotNull String clienteNome, @NotNull String clienteCpf, @NotNull String clienteFone, Set<Agencia> agencias) {
        this.idCliente = idCliente;
        this.clienteNome = clienteNome;
        this.clienteCpf = clienteCpf;
        this.clienteFone = clienteFone;
        this.agencias = agencias;
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

    public Set<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(Set<Agencia> agencias) {
        this.agencias = agencias;
    }
}
