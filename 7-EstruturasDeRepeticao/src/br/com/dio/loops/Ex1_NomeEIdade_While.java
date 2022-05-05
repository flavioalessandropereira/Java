package br.com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjunto de dois valores , o primeiro representando o nome do
aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
 */
public class Ex1_NomeEIdade_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //lê o que é digitado

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");



    }
}
