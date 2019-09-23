package com.sauloaislan.javacore.Csobrecargametodos.test;

import com.sauloaislan.javacore.Csobrecargametodos.classes.Funcionarios;

public class funcionarioTest {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios("Carla Souza", "123.456.789-12", 1800);
//        funcionarios.init("Marcos Souza", "123.456.789-12", 1800);
//        funcionarios.init("Carla Souza", "123.456.789-12", 1800, "45678-8");

        funcionarios.imprime();
    }
}
