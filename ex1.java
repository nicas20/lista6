package com.mycompany.lista6;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        float vetor[] = new float[10];

        int neg, soma;

        neg = soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Insira o valor " + (i + 1) + " --> ");
            vetor[i] = sc.nextFloat();

            if (vetor[i] > 0) {
                soma += vetor[i];
            } else {
                neg++;
            }

        }

        System.out.println("A quantidade de números negativos é: " + neg);

        System.out.println("A soma dos números positivos é: " + soma);

    }

}
