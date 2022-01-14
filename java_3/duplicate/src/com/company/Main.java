package com.company;

import java.util.Scanner;

//2. Write a program to find if any element is duplicate. If duplicate, show the value.
public class Main {

    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }

        int dup=0;

        for (int i = 0; i <=n; i++)
        {
            for (int j = 1; j <=n-1; j++)
            {
                if (array[i]==array[j])
                {
                    dup=array[i];

                }

            }

        }
        System.out.println("dup:"+ dup);

    }
}


