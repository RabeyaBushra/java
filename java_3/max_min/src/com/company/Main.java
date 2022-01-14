package com.company;
//3. Find
//the max and min number from a given array
public class Main {

    public static void main(String[] args) {
                int[] num ={2, 5, 7, 1};
                int max=0;
                int min=0;
                for (int i = 0; i <=3; i++)
                {
                    for (int j = 1; j <=2; j++)
                    {
                        if (num[i]>num[j])
                        {
                            max=num[i];
                            System.out.println("max :"+ max);
                        }

                    }

                }

        for (int i = 0; i <=3; i++)
        {
            for (int j = 1; j <=2; j++)
            {
                if (num[i]<num[j])
                {
                    min=num[i];

                }

            }

        }
        System.out.println("min :"+ min);

            }
        }


