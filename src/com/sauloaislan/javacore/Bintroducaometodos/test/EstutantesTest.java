package com.sauloaislan.javacore.Bintroducaometodos.test;

import com.sauloaislan.javacore.Bintroducaometodos.classes.Estudantes;

public class EstutantesTest {
    public static void main(String[] args) {
        Estudantes estudante = new Estudantes();
        estudante.setNome("Saulo Aislan");
        estudante.setIdade(21);
        estudante.setNotas(new double[]{7,7.5,8});
        estudante.imprime();
        estudante.tirarMedia();
        System.out.println(estudante.getNome());
        System.out.println("Aprovado? "+estudante.isAprovado());

    }
}
