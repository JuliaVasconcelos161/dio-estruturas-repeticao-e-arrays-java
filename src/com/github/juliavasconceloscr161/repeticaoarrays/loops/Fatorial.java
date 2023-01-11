package com.github.juliavasconceloscr161.repeticaoarrays.loops;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Insira um número para ver seu fatorial:");
        int numero = sc.nextInt();


        System.out.print("!" + numero + " = ");
        for(int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
            if(i != 1){
                System.out.print(i + "x");
            }
            else {
                System.out.print(i);
            }
        }

        System.out.println("\nO fatorial de " + numero + " é " + fatorial);
    }
}
