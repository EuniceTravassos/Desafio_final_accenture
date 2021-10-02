package com.accenture.academico.onlinebank.service;

import com.accenture.academico.onlinebank.Enums.Operacao;
import com.accenture.academico.onlinebank.dao.ClienteDaoI;
import com.accenture.academico.onlinebank.dao.ContaCorrenteDaoI;
import com.accenture.academico.onlinebank.dao.ExtratoDaoI;
import com.accenture.academico.onlinebank.model.Cliente;
import com.accenture.academico.onlinebank.model.ContaCorrente;
import com.accenture.academico.onlinebank.model.Extrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContaCorrenteService {

    @Autowired
    private ContaCorrenteDaoI dao;

    @Autowired
    private ExtratoDaoI daoExtrato;

    @Autowired
    private ClienteDaoI daoCliente;

    private Optional<Cliente> cliente;

    private Extrato extrato;

    private List<Extrato> listaExtrados = new ArrayList<>();;

    private Optional<ContaCorrente> contaCorrente;

    public ContaCorrenteService() {

    }

    public boolean saque(Cliente cliente) {

            this.contaCorrente = dao.findById(cliente.getContaCorrentes().get(0).getIdContaCorrente());
            this.cliente = daoCliente.findById(cliente.getIdCliente());

            //Verifica se a conta passada no json é uma contas que existe no banco de dados
            if (this.contaCorrente.get().getIdContaCorrente() == cliente.getContaCorrentes().get(0).getIdContaCorrente()) {
                //verifica se o valor da conta passada no json é menor ou maior do que o valor da conta no banco
                if (this.contaCorrente.get().getContaCorrenteSaldo() < cliente.getContaCorrentes().get(0).getContaCorrenteSaldo()) {
                    //deposito
                    this.extrato = new Extrato();
                    this.extrato.setContaCorrente(cliente.getContaCorrentes().get(0));
                    this.extrato.setOperacao(Operacao.DEPOSITO);
                    this.extrato.setValorOperacao(cliente.getContaCorrentes().get(0).getContaCorrenteSaldo() - this.contaCorrente.get().getContaCorrenteSaldo());

                    listaExtrados.add(daoExtrato.save(extrato));

                    dao.save(cliente.getContaCorrentes().get(0));
                    this.cliente.get().setExtratos(listaExtrados);
                    daoCliente.save(this.cliente.get());

                    return true;
                } else {
                    //saque

                    this.extrato = new Extrato();
                    this.extrato.setContaCorrente(cliente.getContaCorrentes().get(0));
                    this.extrato.setOperacao(Operacao.SAQUE);
                    this.extrato.setValorOperacao(cliente.getContaCorrentes().get(0).getContaCorrenteSaldo() - this.contaCorrente.get().getContaCorrenteSaldo());

                    listaExtrados.add(daoExtrato.save(extrato));

                    dao.save(cliente.getContaCorrentes().get(0));
                    this.cliente.get().setExtratos(listaExtrados);
                    daoCliente.save(this.cliente.get());

                    return true;
                }

            } else {
                return false;
            }
    }
}
