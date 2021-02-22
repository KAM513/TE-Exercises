package com.techelevator;

public class QuizQuestion {
    private String correctAnswer;
    private String question;
    private String[] answers;
    private String quizQuestion;

    public QuizQuestion(String line, String[] answers, String correctAnswer, String quizQuestion) {
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.quizQuestion = quizQuestion;
        String[] sections = line.split ("\\|");


        this.question = sections[0];


        for (int i = 1; i < sections.length; i++) {
            String answer = sections[i].trim ();


            if (answer.endsWith ("*")) {
                answer = answer.substring (0, answer.length () - 1);
                this.correctAnswer = Integer.toString (i);
            }
            answers[i - 1] = answer;
        }
    }

    public QuizQuestion(String quizQuestionFromFile, String question, String[] answers) {

        this.question = question;
        this.answers = answers;
    }

    public QuizQuestion() {



    }


    public String getQuestion() {
        return this.question;
    }

    public String[] getAnswers() {
        return this.answers;
    }

    public boolean isCorrectAnswer(String selectedAnswer) {
        return this.correctAnswer.equals (selectedAnswer);
    }


    public String getQuizQuestion() {
        return quizQuestion;
    }

    public boolean getCorrectAnswerIndex() {
        return true;
    }
    public void setQuestion (String question) {
        this.question = question;
    }
//    public void setAnswer (String[] answer) {
//        this.answer = answer;
}

