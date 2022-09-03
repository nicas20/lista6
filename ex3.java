package com.mycompany.lista6;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];

        List<Integer> rep = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();

        }

        for (int i = 0; i < vetor.length; i++) {

            if (!rep.contains(vetor[i])) {

                for (int j = i + 1; j < vetor.length; j++) {

                    if (vetor[i] == vetor[j]) {

                        rep.add(vetor[i]);

                        break;

                    }

                }

            }

        }

        System.out.println("Total de números iguais: " + rep);

    }

}