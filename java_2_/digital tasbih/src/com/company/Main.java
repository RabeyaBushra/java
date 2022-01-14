package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int count=0;
        int count2;

        System.out.println("press the count ");
        Scanner s = new Scanner(System.in);
        while (true) {

            count2=s.nextInt();//press 1 from the user
            count=count+count2;

            if(count2==0){
                count2=0;
                System.out.println(count2);
                break;}

            System.out.println(count);
    }}
}
