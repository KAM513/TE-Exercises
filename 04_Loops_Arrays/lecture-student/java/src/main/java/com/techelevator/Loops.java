//package com.techelevator;

public class Loops {

    public static void main(String[] args) {

        //Count up

        for (int i = 1; i <11; i += 1) {
            System.out.println(i);
        }

        //Count down

        for (int i = 400; i > 0; i --) {
            System.out.println(i);
        }

        //Add up numbers 1-100

        int sum = 0;
        for (int i = 1; i <= 100; i ++) {
            sum += i;
            System.out.println(sum);
        }


        //Add up only odd numbers

        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                oddSum += i;
            }

        }
        System.out.println(oddSum);