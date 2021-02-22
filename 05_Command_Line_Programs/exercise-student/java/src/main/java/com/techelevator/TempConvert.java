package com.techelevator;

import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {


//		don't forget user input!!
        Scanner keyboard = new Scanner (System.in);

        double userTemp;
        double convertedTemperature;
        String input;
        String degreesIn;

        System.out.println (" Please enter the temperature:");
        input = keyboard.nextLine ();
        userTemp = Double.parseDouble (input);

        System.out.println ("Is the temperature in [C]elsius, or [F]ahrenheit?");
        degreesIn = keyboard.nextLine ();


        if (degreesIn.equalsIgnoreCase ("c")) {
            convertedTemperature = userTemp * 1.8 + 32;
            System.out.printf ("%.1f C is %.1f F", userTemp, convertedTemperature);
        } else {
            convertedTemperature = (userTemp - 32) / 1.8;
            System.out.printf ("%.1f F is %.1f C", userTemp, convertedTemperature);
        }
    }
}
//Tc = (Tf - 32) / 1.8
//Tf = Tc * 1.8 + 32
//Please enter the temperature: 58
//Is the temperature in (C)elsius, or (F)ahrenheit? F
//58F is 14C.