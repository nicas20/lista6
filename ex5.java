package com.mycompany.lista6;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int i;

        for (i = 0; i < vetor.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("1- ");
        System.out.println("2- ");
        System.out.println("0- ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("O programa será finalizado");
            System.exit(n);
        } else if (n == 1) {
            for (i = 0; i < 5; i++) {
                System.out.println(vetor[i]);
            }
        } else if (n == 2) {
            for (i = 4; i >= 0; i--) {
                System.out.println(vetor[i]);
            }
        }
    }
}
