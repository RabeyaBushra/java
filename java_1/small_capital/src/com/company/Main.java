package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the capital or small input");
        String alpha= s.next();

        if(alpha.equals(alpha.toUpperCase()))
        {
            System.out.println("capital");
        }
        else
        {
            System.out.println("small");
        }

    }
}
