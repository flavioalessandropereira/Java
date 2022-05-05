package br.com.dio.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuaba de qualquer número
inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo:

Tabuada do 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */
public class Ex5_Tabuada_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digita a tabuada que deseja: ");
        int tabuada = scan.nextInt();
        System.out.println();

        for(int i = 1 ; i <= 10 ; i++){

            System.out.println(tabuada + " x "+ i + " = " + (tabuada * i));

        }

    }
}
