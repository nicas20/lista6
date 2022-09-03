package com.mycompany.lista6;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int i, x, qtd = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Insira o " + (i + 1) + "º valor");
            vet[i] = sc.nextInt();
        }
        System.out.println("Insira um número x inteiro: ");
        x = sc.nextInt();

        for (i = 0; i < 10; i++) {
            if (vet[i] % x == 0) {
                System.out.println(vet[i]);
                qtd++;
            }
        }
        System.out.println("Quantidade de multiplos: " + qtd);
    }

}