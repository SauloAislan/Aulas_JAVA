package com.sauloaislan.javacore.Gassociacao.classes;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void print() {
        System.out.println("--------------------Relatório Seminario---------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
        if (this.professor != null)
            System.out.println("Professor:" + this.professor.getNome());
        else
            System.out.println("Não há Professor Cadastrado");

        if (this.professor != null)
            System.out.println("Local, Rua:" + this.local.getRua() + " Bairro: " + this.local.getBairro());
        else
            System.out.println("Não há Local Cadastrado");
        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos Particiantes: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Não há Alunos Cadastrado");
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
