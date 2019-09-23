package com.sauloaislan.javacore.Aintroducaoclasses.test;

import com.sauloaislan.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Antonio Buarque";
        professor.Matricula = "12345";
        professor.cpf = "123.456.789-78";
        professor.rg = "20201-2";

        System.out.println(professor.nome);
        System.out.println(professor.Matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);

    }
}
