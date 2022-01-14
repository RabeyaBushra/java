package com.company;



        public class Main {
            public static void main(String[] args) {
                int count;
                System.out.println(" Prime Numbers from 1 to 100 are : ");
                int number=1 ;
                while(number<=100)
                {
                    count = 0;
                    for (int i = 2; i <= number/2; i++)
                    {
                        if(number % i == 0)
                        {
                            count++;
                            break;
                        }


                    }
                    number++;
                    if(count == 0 && number != 1 )
                    {
                        System.out.print(number + " ");
                    }
                }
            }

        }

