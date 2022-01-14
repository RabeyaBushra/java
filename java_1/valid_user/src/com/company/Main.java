package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String _user="bushra";
        String _password="1234";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the user name");
        String username= s.next();
        System.out.println("Enter the password");
        String password= s.next();
        if (username.equals(_user) && password.equals(_password))
        {  System.out.println("Access granted");  }
        else
        {  System.out.println("not granted");  }
    }
}
