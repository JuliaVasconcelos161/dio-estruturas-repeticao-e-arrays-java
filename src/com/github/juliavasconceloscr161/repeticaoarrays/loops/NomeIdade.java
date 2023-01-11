package com.github.juliavasconceloscr161.repeticaoarrays.loops;

import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando sua idade.
*(Pare o programa quando nome tiver valor 0) */
public class NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        while(true) {
            System.out.println("Insira um nome: ");
            nome = sc.next();
            if(nome.equals("0")) {
                break;
            }

            System.out.println("Insira uma idade: ");
            idade = sc.nextInt();
        }
        System.out.println("O programa foi encerrado!");


    }
}
