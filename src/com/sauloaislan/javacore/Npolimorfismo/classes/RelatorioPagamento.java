package com.sauloaislan.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerente relatorio de pagamento para a Gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendendor(Vendendor vendendor){
//        System.out.println("Vendedor relatorio de pagamento para os Vendedores");
//        vendendor.calcularPagamento();
//        System.out.println("Nome: " + vendendor.getNome());
//        System.out.println("Salario: " + vendendor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Vendedor relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação dos Lugros: " + g.getPnl());
        }
        if (funcionario instanceof Vendendor){
            System.out.println("Total de vendas: " + ((Vendendor) funcionario).getTotalVendas());
        }
    }
}
