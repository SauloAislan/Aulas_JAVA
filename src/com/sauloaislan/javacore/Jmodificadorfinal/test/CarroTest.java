package com.sauloaislan.javacore.Jmodificadorfinal.test;

import com.sauloaislan.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Goku");
        System.out.println(c.getComprador());
//        Carro.VELOCIDADE_FINAL;
    }
}
