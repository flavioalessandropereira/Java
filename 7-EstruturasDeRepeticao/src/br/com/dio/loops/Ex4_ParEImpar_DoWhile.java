package br.com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */
public class Ex4_ParEImpar_DoWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int contador = 0;
        int numeros =1;
        int quantPares = 0, quantImpares = 0;

        do {
            System.out.println("Número " + (numeros++) + " : ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            contador ++;
        } while (contador < quantNumeros);

        System.out.println("Quantidade de números pares: " +quantPares);
        System.out.println("Quantidade de números ímpares: " +quantImpares);
    }
}
