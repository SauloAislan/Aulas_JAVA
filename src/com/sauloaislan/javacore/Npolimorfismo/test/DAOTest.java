package com.sauloaislan.javacore.Npolimorfismo.test;

import com.sauloaislan.javacore.Npolimorfismo.classes.ArquivoDAOimpl;
import com.sauloaislan.javacore.Npolimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAOimpl = new ArquivoDAOimpl();
        arquivoDAOimpl.save();
        List<String> lista = new ArrayList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        lista.add("nome5");
        for(String nome : lista)
            System.out.println(nome);
    }
}
