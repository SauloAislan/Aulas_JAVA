package com.sauloaislan.javacore.Passertions.test;

public class AssertTest {
    public static void main(String[] args) {
        calcularSalario(2000);
    }
    private static void calcularSalario(double salario){
        assert (salario > 0);

    }
}
