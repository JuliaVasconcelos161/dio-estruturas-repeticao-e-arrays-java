package com.github.juliavasconceloscr161.repeticaoarrays.loops;
/*Faça um programa que peça N  números inteiros,
* calcule e mostre a quantidade de números pares
* e a quantidade de números ímpares*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Insira a quantidade de números inteiros:");
        int numerosInteiros = sc.nextInt();

        for(int i = 0; i < numerosInteiros; i++) {
            System.out.println("Insira um número:");
            numero = sc.nextInt();

            if(numero % 2 == 0) {
                quantidadePares++;
            }
            else {
                quantidadeImpares++;
            }

        }

        System.out.println("Quantidade de Pares: " + quantidadePares);
        System.out.println("Quantidade de Ímpares: " + quantidadeImpares);
    }
}
