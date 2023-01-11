package com.github.juliavasconceloscr161.repeticaoarrays.loops;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada,
* capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10,
* O usuário deve informar qual número ele deseja ver a tabuada
* a saída deve ser como exemplo abaixo.
*
* Tabuada de 5:
* 5 x 1 = 5
* 5 x 2 = 10
* ...
* 5 x 10 = 50
*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número de entre 1 e 10 para ver a tabuada:");
        int numero = sc.nextInt();

        if((numero > 0) && (numero <= 10)) {
            System.out.println("Tabuada de " + numero + ":");
            for(int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero*i));
            }
        }
        else {
            System.out.println("Número inválido!");
        }
    }
}
