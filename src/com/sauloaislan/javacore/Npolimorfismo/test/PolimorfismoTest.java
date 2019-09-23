package com.sauloaislan.javacore.Npolimorfismo.test;

import com.sauloaislan.javacore.Npolimorfismo.classes.Funcionario;
import com.sauloaislan.javacore.Npolimorfismo.classes.Gerente;
import com.sauloaislan.javacore.Npolimorfismo.classes.RelatorioPagamento;
import com.sauloaislan.javacore.Npolimorfismo.classes.Vendendor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("José", 4500, 2000);
        Vendendor v = new Vendendor("Maria", 2000, 20000);
        RelatorioPagamento r = new RelatorioPagamento();
//        r.relatorioPagamentoGerente(g);
//        r.relatorioPagamentoVendendor(v);

        r.relatorioPagamentoGenerico(g);
        System.out.println("########################");
        r.relatorioPagamentoGenerico(v);

    }
}
