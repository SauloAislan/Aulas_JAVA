package com.sauloaislan.javacore.Gassociacao.test;

import com.sauloaislan.javacore.Gassociacao.classes.Aluno;
import com.sauloaislan.javacore.Gassociacao.classes.Local;
import com.sauloaislan.javacore.Gassociacao.classes.Professor;
import com.sauloaislan.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Saulo Aislan", 30);
        Aluno aluno2 = new Aluno("Bia Hammad", 23);
        Seminario seminario = new Seminario("Java é mais ou menos");
        Professor professor = new Professor("Yoda", "Usar a força par aprogramar");
        Local local = new Local("La em baixo","Ali");

        seminario.setProfessor(professor);
//        seminario.setLocal(local);
//        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

//        aluno.print();

        Seminario[] arraysem = new Seminario[1];
        arraysem[0] = seminario;
        professor.setSeminarios(arraysem);

        seminario.print();
        professor.print();
        aluno.print();
        local.print();


//         OU
//        professor.setSeminarios(new Seminario[]{seminario});

    }
}
