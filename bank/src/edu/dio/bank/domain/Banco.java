package edu.dio.bank.domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }
}
