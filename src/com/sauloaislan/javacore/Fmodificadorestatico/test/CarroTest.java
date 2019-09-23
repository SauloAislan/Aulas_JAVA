package com.sauloaislan.javacore.Fmodificadorestatico.test;

import com.sauloaislan.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Ferrari", 320);
        Carro c3 = new Carro("Audi", 260);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("#############################");

        Carro.setVelocidadeLimite(220);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
