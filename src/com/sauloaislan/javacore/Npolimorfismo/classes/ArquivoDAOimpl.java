package com.sauloaislan.javacore.Npolimorfismo.classes;

public class ArquivoDAOimpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
