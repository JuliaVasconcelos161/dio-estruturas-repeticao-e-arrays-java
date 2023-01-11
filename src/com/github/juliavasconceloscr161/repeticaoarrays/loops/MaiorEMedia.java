package com.github.juliavasconceloscr161.repeticaoarrays.loops;

import java.util.Scanner;

/*Faça um programa que leia 5 números
* e informe o maior numero
* e a media desses numeros*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        double maiorNumero = 0;
        double soma = 0;
        double media;

        for(int i = 0; i < 5; i++) {
            System.out.println("Insira um número: ");
            numero = sc.nextInt();

            soma += numero;
            if(numero > maiorNumero) {
                maiorNumero = numero;
            }

        }

        media = soma/5;
        System.out.println("A média é " + media);

    }
}
