package com.sauloaislan.javacore.Minterfaces.test;

import com.sauloaislan.javacore.Minterfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 4, 4000);
        produto.calcularFrete();
        produto.calcularImposto();
        System.out.println(produto);
    }
}
