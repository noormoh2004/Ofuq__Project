package com.example.ofuqproject.model;

public class Puzzle {
    private String question;
    private String answer;
    private String hint;

    public Puzzle(String question, String answer, String hint) {
        this.question = question;
        this.answer = answer;
        this.hint = hint;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getHint() {
        return hint;
    }


}
