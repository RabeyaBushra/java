package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10, 5, 2,1};
        int[] noteCounter = new int[ 8 ];

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[ i ]) {
                noteCounter[ i ] = amount / notes[ i ];
                amount = amount - notes[ i ] * noteCounter[ i ];
                System.out.println(notes[ i ] + " Notes used: " + noteCounter[ i ]);
            }
            if (amount < 2) {
                break;
            }
        }

        System.out.println();

    }
}
