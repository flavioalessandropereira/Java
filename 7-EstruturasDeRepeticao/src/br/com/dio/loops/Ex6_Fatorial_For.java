package br.com.dio.loops;


import java.util.Scanner;

/*
Faça um programa que calcule o fatorial do número fornecido pelo usuário.
Ex: 5! = 120
( 1 x 2 x 3 x 4 x 5)
 */
public class Ex6_Fatorial_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero a ser fatoriado: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        for(int i = fatorial; i >= 1; i--){
                 multiplicacao = multiplicacao * i;
        }
        System.out.println();
        System.out.println("O valor " + fatorial + " !  = " + multiplicacao);
    }

}
