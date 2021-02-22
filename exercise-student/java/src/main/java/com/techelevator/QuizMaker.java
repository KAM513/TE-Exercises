package com.techelevator;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class QuizMaker {
    public QuizMaker() {
    }
    public static <QuizQuestions> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
        String fileName = input.nextLine();
        Path myPath = Path.of(fileName);
        QuizQuestions question1 = (QuizQuestions) new QuizQuestion ();
        int correctAnswerCount = 0;
        int timesThroughScannerLoop = 0;
        try {
            Scanner scan = new Scanner(myPath);
            try {
                for(; scan.hasNextLine(); ++timesThroughScannerLoop) {
                    String line = scan.nextLine();
                    String[] lineArray = line.split("\\|");
                    for(int i = 1; i < lineArray.length; ++i) {
                        if (lineArray[i].contains("*")) {
                            lineArray[i] = lineArray[i].replace("*", " ");
                        }
                    }
//                    question1.setQuestion(lineArray[0]);
//                    question1.setAnswer1(lineArray[1]);
//                    question1.setAnswer2(lineArray[2]);
//                    question1.setAnswer3(lineArray[3]);
//                    question1.setAnswer4(lineArray[4]);

//                    System.out.println(((QuizQuestion) question1).getQuestion());
//                    System.out.println("1. " + question1.getAnswer1());
//                    System.out.println("2. " + question1.getAnswer1());
//                    System.out.println("3. " + question1.getAnswer1());
//                    System.out.println("4. " + question1.getAnswer1());
                    System.out.println("\nYour answer");
                    String userAnswer = input.nextLine();
                    int userInt = Integer.parseInt(userAnswer);
//                    if (!(userInt == question1.getCorrectAnswer ())) {
//                        System.out.println("Correct!");
//                        ++correctAnswerCount;
//                    } else {
//                        System.out.println("Incorrect");
//                    }
                }
            } catch (Throwable var13) {
                try {
                    scan.close();
                } catch (Throwable var12) {
                    var13.addSuppressed(var12);
                }
                throw var13;
            }
            scan.close();
        } catch (IOException var14) {
            System.out.println("Try again!");
        }
        System.out.println("You got " + correctAnswerCount + " answers correct from " + timesThroughScannerLoop + " questions.");
    }
}
