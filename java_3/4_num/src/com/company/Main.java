package com.company;

import java.util.HashMap;
import java.util.Scanner;

//4. Write a program to generate random number from 1 to 10 but print by it's alphabetical version. suppose random number is 3. But it will print Three. Each time you will press enter, it will generate new random numbers from 1-10 and will show its alphabetical version.
public class Main {

    public static void main(String[] args) {
        System.out.println("created random number");
        double rand_value1 = Math.random() * 10;
        int ran1 = (int) rand_value1;
        System.out.println(ran1);


            HashMap< Integer, String> capitalCities = new HashMap<Integer, String>();

        if(ran1==0)
        {
            capitalCities.put(ran1, "ZERO");
            System.out.println(capitalCities.get(ran1));
        }
            if(ran1==1)
            {
                capitalCities.put(ran1, "ONE");
                System.out.println(capitalCities.get(ran1));
            }
        if(ran1==2)
        {
            capitalCities.put(ran1, "TWO");
            System.out.println(capitalCities.get(ran1));
        }
        if(ran1==3)
        {
            capitalCities.put(ran1, "THREE");
            System.out.println(capitalCities.get(ran1));
        }
        if(ran1==4)
        {
            capitalCities.put(ran1, "FOUR");
            System.out.println(capitalCities.get(ran1));
        }
        if(ran1==5)
        {
            capitalCities.put(ran1, "FIVE");
            System.out.println(capitalCities.get(ran1));
        }
        if(ran1==6)
        {
            capitalCities.put(ran1, "SIX");
            System.out.println(capitalCities.get(ran1));
        }
        if(ran1==7)
        {
            capitalCities.put(ran1, "SEVEN");
            System.out.println(capitalCities.get(ran1));
        }
        if(ran1==8)
        {
            capitalCities.put(ran1, "EIGHT");
            System.out.println(capitalCities.get(ran1));
        }

        if(ran1==9)
        {
            capitalCities.put(ran1, "NINE");
            System.out.println(capitalCities.get(ran1));
        }
        if(ran1==10)
        {
            capitalCities.put(ran1, "TEN");
            System.out.println(capitalCities.get(ran1));
        }
            //System.out.println(capitalCities);

        }

    }






