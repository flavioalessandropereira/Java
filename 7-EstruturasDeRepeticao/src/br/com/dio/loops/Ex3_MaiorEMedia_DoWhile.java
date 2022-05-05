package br.com.dio.loops;

/*
Faça um programa que leia 5 números inteiros e informe o maior número
e a média desses números.
 */

import java.util.Scanner;

public class Ex3_MaiorEMedia_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int soma=0;

        int contador = 0;


        do {
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorNumero) maiorNumero = numero;
            contador += 1;

        } while (contador < 5);

        System.out.println("O maior número digitado foi: " + maiorNumero);

        System.out.println("A média dos numeros digitados: " + (soma/5) );
    }
}
