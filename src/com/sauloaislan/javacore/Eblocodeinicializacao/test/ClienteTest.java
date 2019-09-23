package com.sauloaislan.javacore.Eblocodeinicializacao.test;

import com.sauloaislan.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis:");
        for(int parc : c.getParcelas()){
            System.out.print(parc + " ");
        }
    }
}
