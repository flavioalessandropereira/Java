package br.com.dio.arrays;

import java.util.Random;

/*
Faça um Programa que leia 10 numeros inteiros aleatórios( entre 0 e 100),
armazena-os num vetor. Ao final mostre os números e sucessores.
 */
public class Ex3_NumerosAleatorios_For_ForEach {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[10];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios ) {
            System.out.print((numero -1) + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios ) {
            System.out.print((numero +1) + " ");
        }
    }
}
