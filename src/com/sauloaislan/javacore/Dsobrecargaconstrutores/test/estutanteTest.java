package com.sauloaislan.javacore.Dsobrecargaconstrutores.test;

import com.sauloaislan.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class estutanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("12346", "Jessica Arruda", new double[]{5.9, 7, 8}, "15//09/2019");
        estudante.imprime();
    }
}
