package com.sauloaislan.javacore.Fmodificadorestatico.classes;

public class Cliente {
    // 0 - Bloco de inicialização estático é executado quanto a JVM carregar a classe (é executado apenas 1 vez)
    // 1 - Alocado espaço na memoria para o objeto que será criado
    // 2 - cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - O contrutor é executado

    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("Dentro do Init");
        for(int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
