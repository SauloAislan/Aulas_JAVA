package com.sauloaislan.javacore.Fmodificadorestatico.test;


import com.sauloaislan.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis:");
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
//        for(int parc : c1.getParcelas()){
//            System.out.print(parc + " ");
//        }
    }
}
