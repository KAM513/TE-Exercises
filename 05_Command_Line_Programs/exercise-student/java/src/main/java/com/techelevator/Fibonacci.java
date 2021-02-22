package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        String input;
        int stopNumber;

        System.out.println ("Please enter an integer: ");
        input = keyboard.nextLine ();
        stopNumber = Integer.parseInt (input);
        System.out.print("These are the Fibonacci numbers preceding your integer: ");

        int fibonacci;
        int firstNum = 0;
        int secondNum = 1;


        for (int i = 0; i <= stopNumber; i++) {
            if (stopNumber <= firstNum) {

                break;
            }
            System.out.print (firstNum + " ");
            fibonacci = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fibonacci;

        }
    }
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...