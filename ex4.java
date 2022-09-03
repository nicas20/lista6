package com.mycompany.lista6;

import java.util.Scanner;

import java.util.HashSet;

import java.util.Set;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];

        for (int x = 0; x < vetor.length; x++) {
            System.out.println("Insira o " + (x + 1) + "º valor:");
            vetor[x] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int a : vetor) {
            set.add(a);
        }
        System.out.println(set);

    }

}
