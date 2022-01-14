package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  number");
        int num= s.nextInt();
        if (num>=0)
        {
            System.out.println("positive");
        }

        else
        {
            System.out.println("negative");
        }

    }
}
