package com.sauloaislan.javacore.Rstrings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStraingBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStraingBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer " + (fim - inicio) + " ms");
    }

    private static void concatString(int tam){
        String string = "";
        for (int i = 0; i<tam; i++){
            string += i;
        }
    }

    private static void concatStraingBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i<tam; i++){
            sb.append(i);
        }
    }

    private static void concatStraingBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i<tam; i++){
            sb.append(i);
        }
    }
}
