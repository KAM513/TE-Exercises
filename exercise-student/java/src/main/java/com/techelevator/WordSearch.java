package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordSearch {

    private static Scanner userInput;
    public static void main(String[] args) throws FileNotFoundException {
        userInput = new Scanner (System.in);
        File inputFile = getFileFromUser ();
//        int lineCount = ;
        try (Scanner fileIn = new Scanner (inputFile)) {

            int lineNumber = 0;

            System.out.println ("What is the word you are searching for? ");
            String searchWord = userInput.nextLine ();


                System.out.println ("Should this search be case sensitive (Y) or (N)? ");
                String answer = userInput.nextLine ();
            if ((searchWord.isEmpty () == false) && (answer.isEmpty () == false)) {

                if (answer.equals ("Y")) {

                    while (fileIn.hasNextLine ()) {
                        String line = fileIn.nextLine ();
                        lineNumber++;

                        if (line.contains (searchWord)) {

                            System.out.println (lineNumber + ") " + line);

                        }
                    }
                }
                if (answer.equals ("N")) {
                    while (fileIn.hasNextLine ()) {
                        String line = fileIn.nextLine ();
                        lineNumber++;

                        String word = searchWord.toUpperCase ();
//                    String restOfLetters = searchWord.substring (1);
//                    String lowerCase = ;
//
//                    String firstLetter1 = searchWord.substring (0, 1).toLowerCase ();
//                    String restOfLetter1 = searchWord.substring (1);
//                    String upperCase = firstLetter + restOfLetters;

                        if (line.toUpperCase ().contains (word)) {

                            System.out.println (lineNumber + ") " + line);
                        }
                    }
                }
            }
        }
    }

    private static File getFileFromUser() {


        System.out.println ("What is the fully qualified name of the file to be searched?: ");
        String path = userInput.nextLine ();

        File inputFile = new File (path);
        if (inputFile.exists () == false) {
            System.out.println (path + " does not exist");
            System.exit (1);
        } else if (inputFile.isFile () == false) {
            System.out.println (path + " is not a file");
            System.exit (1);
        }
        return inputFile;
    }


}








