package com.sauloaislan.javacore.Bintroducaometodos.test;

import com.sauloaislan.javacore.Bintroducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int a = 5;
        int b = 10;

        calc.alteradaDoisNumerros(a,b);
    }
}
