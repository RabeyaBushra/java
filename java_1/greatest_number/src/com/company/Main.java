package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
          System.out.println("Enter the 1st number");
          int num1= s.nextInt();
          System.out.println("Enter the 2nd number");
          int num2= s.nextInt();
          System.out.println("Enter the 3rd number");
          int num3= s.nextInt();


        if (num1>num2)
        {
            if (num1>num3)
            {
                System.out.println("num1 is the greatest number \t" +num1);
            }
        }

        if (num1<num2)
        {
            if (num2>num3)
            {
                System.out.println("num2 is the greatest number \t " + num2);
            }
        }
        if (num3>num1)
        {
            if (num3>num2)
            {
                System.out.println("num3 is the greatest number\t " + num3);
            }
        }

    }
}
