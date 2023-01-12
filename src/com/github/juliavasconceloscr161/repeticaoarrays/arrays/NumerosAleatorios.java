package com.github.juliavasconceloscr161.repeticaoarrays.arrays;

/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os em um vetor.
* Ao final mostre os números, seus sucessores e antecessores*/
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int numero;
        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nNúmeros aleátorios: ");
        for(int numeroAleatorio: numerosAleatorios) {
            System.out.print(numeroAleatorio + " ");
        }

        System.out.print("\nAntecessores dos números aleátorios: ");
        for(int numeroAleatorio: numerosAleatorios) {
            System.out.print((numeroAleatorio - 1) + " ");
        }

        System.out.print("\nSucessores dos números aleátorios: ");
        for(int numeroAleatorio: numerosAleatorios) {
            System.out.print((numeroAleatorio + 1) + " ");
        }

    }
}
