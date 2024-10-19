package com.example.prac;

public class FlashCard {
    private String question;
    private String answer;
    private String topic;  // optional attribute to categorize flashcards
    private int difficulty;  // optional attribute to set the difficulty level (1-5)

    // Constructor
    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // Overloaded constructor with more attributes
    public FlashCard(String question, String answer, String topic, int difficulty) {
        this.question = question;
        this.answer = answer;
        this.topic = topic;
        this.difficulty = difficulty;
    }

    // Getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        if (difficulty < 1 || difficulty > 5) {
            throw new IllegalArgumentException("Difficulty must be between 1 and 5");
        }
        this.difficulty = difficulty;
    }

    // Optional method to show the flashcard (for example, in GUI)
    public void displayCard() {
        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);
        if (topic != null) {
            System.out.println("Topic: " + topic);
        }
        if (difficulty > 0) {
            System.out.println("Difficulty: " + difficulty);
        }
    }
}

