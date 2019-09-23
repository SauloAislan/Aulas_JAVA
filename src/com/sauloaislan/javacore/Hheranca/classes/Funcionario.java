package com.sauloaislan.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Salario: " + this.getSalario());
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu: " + super.nome+" recebi o pagamento de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
