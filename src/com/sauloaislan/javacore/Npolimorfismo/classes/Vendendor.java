package com.sauloaislan.javacore.Npolimorfismo.classes;

public class Vendendor extends Funcionario {
    private double totalVendas;

    public Vendendor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totalVendas * 0.5);
    }
}
