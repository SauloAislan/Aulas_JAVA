package com.sauloaislan.javacore.Bintroducaometodos.test;

import com.sauloaislan.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Adição");
        calc.somaDoisNumeros();
        System.out.println("Subtrair");
        calc.subtraiDoisNumeros();
        System.out.println("Multiplicação");
        calc.multiplicaDoisNumeros(5,5);
        System.out.println("Divisão");
        System.out.println(calc.dividiDoisNumeros(100, 10));

        int[] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(numeros);
    }
}
