package com.sauloaislan.javacore.Lclassesabstratas.test;

import com.sauloaislan.javacore.Lclassesabstratas.classes.Funcionario;
import com.sauloaislan.javacore.Lclassesabstratas.classes.Gerente;
import com.sauloaislan.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Marcos", "4564-7", 2000, 1500);
        Gerente gerente = new Gerente("Ana", "sadasd-7", 2000);
        vendedor.calculaSalario();
        gerente.calculaSalario();
        System.out.println(gerente);
        System.out.println(vendedor);
    }
}
