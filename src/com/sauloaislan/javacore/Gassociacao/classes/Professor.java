package com.sauloaislan.javacore.Gassociacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Local local;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("--------------------Relatório Professor---------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios != null && seminarios.length != 0) {
            System.out.println("Seminarios Participantes: ");
            for (Seminario seminario : seminarios) {
                System.out.print(seminario.getTitulo() + " \n");
            }
            return;
        }
        System.out.println("Professor não tem Seminario");
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
