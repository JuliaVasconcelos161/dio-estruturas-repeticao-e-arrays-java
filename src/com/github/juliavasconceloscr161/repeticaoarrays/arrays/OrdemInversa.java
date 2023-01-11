package com.github.juliavasconceloscr161.repeticaoarrays.arrays;

/*Crie um vetor com 6 números inteiros e mostre-os na ordem inversa*/
public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {50, 23, 58, 3, 45, 58};

        for(int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
