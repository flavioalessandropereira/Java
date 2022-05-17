package br.com.dio.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres, e diga
quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Ex2_Consoantes_While_ForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contador = 0;
        do{
            System.out.print("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ){
                consoantes[contador] = letra;
                quantidadeConsoantes++;

            }
            contador++;

        }while(contador < consoantes.length);

        System.out.print("\nConsoantes: ");

        for (String consoante : consoantes) {
            if (consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("");
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println("Quantidade de vezes que foi digitado: " + consoantes.length);
        System.out.println("Quantidade de vogais digitado: " + (consoantes.length - quantidadeConsoantes));

    }

}
