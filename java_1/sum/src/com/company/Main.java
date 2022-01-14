package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {



        System.out.println(" 1st random number");
        double rand_value1= Math.random()*100;
        int ran1 = (int)rand_value1;
        System.out.println(ran1);
        System.out.println(" 2nd random number");
        double rand_value2 = Math.random()*100;
        int ran2 = (int)rand_value2;
        System.out.println(ran2);
        //int sum= ran1 +ran2;
        //System.out.println(sum);


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sum number");
        int num= s.nextInt();

        if ((ran1 +ran2)==num)
        {
            System.out.println("you are correct");

        }
        else
        {
            System.out.println("you are not correct");
        }

    }
}
