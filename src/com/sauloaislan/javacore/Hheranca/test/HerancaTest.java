package com.sauloaislan.javacore.Hheranca.test;

import com.sauloaislan.javacore.Hheranca.classes.Endereco;
import com.sauloaislan.javacore.Hheranca.classes.Funcionario;
import com.sauloaislan.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereco end = new Endereco();

        pessoa.setNome("Saulo Aislan");
        pessoa.setCpf("123456.789-98");
        end.setRua("Ali em baixo");
        end.setBairro("Centro");
        pessoa.setEndereco(end);
        pessoa.print();

        System.out.println("-----------------------------------");
        Funcionario func = new Funcionario("Antonio", "132.456.789-54");
        func.setNome("Antonio Duarte");
        func.setCpf("13.456.789-78");
        func.setSalario(2.568);
        func.setEndereco(end);
        func.print();
    }
}
