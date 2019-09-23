package com.sauloaislan.javacore.Bintroducaometodos.test;

import com.sauloaislan.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.cpf = "132.465.789-78";
        professor.nome = "Maria Antonia";
        professor.matricula = "11245";
        professor.rg = "12345-2";

        professor.imprime();
    }
}
