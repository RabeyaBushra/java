package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number= s.nextInt();

        if(number>=40 && number<=50)
        {
            System.out.println("you got the F grade");
        }
        else if(number>=51 && number<=60)
        {
            System.out.println("you got the C grade");
        }
        else if(number>=60 && number<=70)
        {
            System.out.println("you got the C+ grade");
        }

        else if(number>=70 && number<=80)
        {
            System.out.println("you got the B+ grade");
        }
        else if(number>=80 && number<=90)
        {
            System.out.println("you got the A grade");
        }

        else if(number>=90 && number<=100)
        {
            System.out.println("you got the A+ grade");
        }

    }
}
