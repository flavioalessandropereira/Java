package br.com.dio;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(6,3);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(3,2);
        Calculadora.divisao(5.5,2);
        System.out.println("");

        // Mensagem
        System.out.println("Exercício Mensagens");
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(11);
        Mensagem.obterMensagem(14);
        System.out.println("");

        // Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 6);





    }




}
