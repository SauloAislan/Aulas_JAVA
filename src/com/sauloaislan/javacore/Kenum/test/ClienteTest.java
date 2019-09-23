package com.sauloaislan.javacore.Kenum.test;

import com.sauloaislan.javacore.Kenum.TipoCliente;
import com.sauloaislan.javacore.Kenum.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana", TipoCliente.PESSOA_FISICA);
        System.out.println(c);
    }
}
