package com.sauloaislan.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMat;

    public Estudante() {

    }

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMat) {
        this(matricula, nome, notas);
        this.dataMat = dataMat;
    }

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.dataMat);
        System.out.println(this.nome);
        for (double nota : this.notas) {
            System.out.println(nota + " ");
        }
    }

    public String getDataMat() {
        return dataMat;
    }

    public void setDataMat(String dataMat) {
        this.dataMat = dataMat;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
