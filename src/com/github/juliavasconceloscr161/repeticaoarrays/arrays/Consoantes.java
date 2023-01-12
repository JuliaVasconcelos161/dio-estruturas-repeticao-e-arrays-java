package com.github.juliavasconceloscr161.repeticaoarrays.arrays;

import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas.
* Imprima as consoantes*/

public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letras = new String[6];
        int quantidadeConsoantes = 0;

        for(int i = 0; i < letras.length; i++) {
            System.out.println("Insira a letra " + (i + 1 + ":"));
            letras[i] = sc.next();
            switch(letras[i]) {
                case "A", "a", "E", "e", "I", "i", "O", "o", "U", "u":
                    break;
                default:
                   quantidadeConsoantes++;
                   break;

            }

        }

        if(quantidadeConsoantes != 0) {
            String[] consoantes = new String[quantidadeConsoantes];
            for(int i = 0; i < letras.length; i++) {
                switch(letras[i]) {
                    case "A", "a", "E", "e", "I", "i", "O", "o", "U", "u":
                        break;
                    default:
                        for(int j = 0; j < consoantes.length; j++) {
                            if(consoantes[j] == null) {
                                consoantes[j] = letras[i];
                                break;
                            }
                        }

                }
            }

            System.out.print("Consoantes: ");
            for(int i = 0; i < consoantes.length; i++) {
                System.out.print(consoantes[i] + " ");
            }
            System.out.print("\nQuantidade de consoantes: " + quantidadeConsoantes);
        }
        else {
            System.out.println("Não existem consoantes dentre as letras inseridas.");
        }



    }
}
