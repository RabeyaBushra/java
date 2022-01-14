package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int balance = 1000;

        Scanner s = new Scanner(System.in);
        System.out.println("Choose 1 for Withdraw  or Choose 2 for Check Balance");
        int choice = s.nextInt();
        if (choice == 1) {
            System.out.print("Enter the amount to be withdrawn: ");
            int withdraw = s.nextInt();
            if (balance >= withdraw) {
                balance = balance - withdraw;
                System.out.println("successfully withdraw ");
            } else {
                System.out.println("Insufficient Balance");
            }

        } else {
            System.out.println("Available Balance: " + balance);
            System.out.println("");

        }

    }
}


        ///////////////////////////////////////




            //System.out.println("ATM  Machine)");
            //System.out.println("Choose 1 for Withdraw  or Choose 2 for Check Balance");



            //int choice = s.nextInt();
            //switch (choice)
            //{
                //case 1:
                    //System.out.print("Enter the amount to be withdrawn: ");
                    //int withdraw = s.nextInt();

                    //balance need to be with the withdrawn amount
                    //if (balance >= withdraw)  //for successful transaction
                    //{
                        //balance = balance - withdraw;
                        //System.out.println("Withdrawal successful! Please collect your money.");
                    //}
                    //else //not enough balance
                    //{
                        //System.out.println("Insufficient Balance");
                    //}

                    //System.out.println("");
                    //break;

                //case 2:

                    //System.out.println("Available Balance: " + balance);
                    //System.out.println("");
                    //break;

                //case 3:

                   // System.out.println("Successfully EXIT.");
                    //System.exit(0);
            //}
        //}
    //}







