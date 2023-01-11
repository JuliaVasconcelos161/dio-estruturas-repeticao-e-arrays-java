package com.github.juliavasconceloscr161.repeticaoarrays.loops;

/*Faça um programa que peça uma nota, entre 0 e 10
* Mostre uma mensagem caso o valor seja inválido
* e continue pedindo até que o usuário insira um valor válido*/
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Insira uma nota: ");
        nota = sc.nextInt();

        while((nota < 0) || (nota > 10)) {
            System.out.println("Nota inválida! Insira uma nota: ");
            nota = sc.nextInt();
        }

        System.out.println("O programa foi encerrado!");

    }
}
