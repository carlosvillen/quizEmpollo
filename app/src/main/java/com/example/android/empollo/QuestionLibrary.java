package com.example.android.empollo;

public class QuestionLibrary{
    private String nQuestions [] = {
            "Which part of the plant holds it is the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbird",
            "The _______ holds the plant upright."
    };

    private String nChoices [][] = {
            {"Roots", "Sten", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Sten"}
    };

    private String nCorrectAnsers[] = {"Roots", "Leaves", "Flower", "Sten"};


    public String getQuestion(int a){
        String question = nQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 =nChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 =nChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 =nChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = nCorrectAnsers[a];
        return answer;
    }

    public int getLength() {
        return nQuestions.length;
    }
}
