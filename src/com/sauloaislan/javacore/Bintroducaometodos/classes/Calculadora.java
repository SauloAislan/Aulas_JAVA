package com.sauloaislan.javacore.Bintroducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10-5);
    }

    public void multiplicaDoisNumeros(int a, int b){
        System.out.println(a*b);
    }

    public double dividiDoisNumeros(double a, double b){
        return a/b;
    }

    public void alteradaDoisNumerros(int a, int b){
        a = 30;
        b = 40;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
