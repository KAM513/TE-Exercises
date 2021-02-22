package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    public String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public String letterGrade() {
        return String.valueOf (earnedMarks / possibleMarks);

        double revalue = ;
        if (revalue >= 90) {
            letterGrade = "A";
        } else {
            if (revalue < 90 && revalue >= 80) {
                letterGrade = "B";
            } else {
                if (revalue < 80 && revalue >= 70) {
                    letterGrade = "C";
                } else {
                    if (revalue < 70 && revalue >= 60) {
                        letterGrade = "D";
                    } else {
                        letterGrade = "F";
                    }
                }
            }
        }
        return letterGrade;
    }


    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
    //For 90% or greater, it returns "A"
    //For 80-89%, it returns "B"
    //For 70-79%, it returns "C"
    //For 60-69%, it returns "D"
    //Otherwise, it returns "F"


    public int getEarnedMarks() {
        return earnedMarks;

    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
}

