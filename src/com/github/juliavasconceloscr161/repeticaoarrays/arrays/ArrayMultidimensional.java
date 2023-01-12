package com.github.juliavasconceloscr161.repeticaoarrays.arrays;

import java.util.Random;

/*Gere e imprima uma matriz 4 x 4 com valores aleatórios entre 0 - 9*/
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrizAleatorios = new int[4][4];
        int numero;

        for(int i = 0; i < matrizAleatorios.length; i++) {
            for(int j = 0; j < matrizAleatorios[i].length; j++) {
                numero = random.nextInt(9);
                matrizAleatorios[i][j] = numero;
            }
        }

        System.out.println("Matriz 4 x 4:");
        for(int i = 0; i < matrizAleatorios.length; i++) {
            for(int j = 0; j < matrizAleatorios[i].length; j++) {
                System.out.print(" [" + i + "]" + "[" + j + "]=" + matrizAleatorios[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
