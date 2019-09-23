package com.sauloaislan.javacore.Npolimorfismo.classes;

public class DatabaseDAOimpl implements GenericDAO{
    @Override
    public void save() {
        System.out.println("Salvando dado no Banco de DAdos");
    }
}
