package br.com.dio.arrays;
/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa_While_for {
    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor Atual: ");
        int contador = 0;
        while(contador <= (vetor.length-1)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
