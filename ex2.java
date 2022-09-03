package com.mycompany.lista6;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor[] = new int[5];
        int maior = 0, menor = 0, soma = 0;
        float media;

        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = sc.nextInt();

            soma = soma + valor[i];

            if (valor[i] > maior) {
                maior = valor[i];
            }

        }

        media = soma / 5;

        for (int j = 0; j < valor.length; j++) {
            if (valor[j] < menor) {
                menor = valor[j];
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média do vetor: " + media);
    }
}
