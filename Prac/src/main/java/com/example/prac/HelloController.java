package com.example.prac;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button noteButton1;

    @FXML
    private void handleAction1() {
        try {
            // Load the notes FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
            Parent notesRoot = loader.load();

            // Create a new scene for the notes
            Scene notesScene = new Scene(notesRoot, 600, 400); // Set the width and height as needed

            // Get the current stage
            Stage currentStage = (Stage) noteButton1.getScene().getWindow();
            currentStage.setScene(notesScene); // Set the new scene
            currentStage.show(); // Show the new scene
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions that occur during loading
        }
    }

    @FXML
    private void handleAction2() {
        try {
            // Load the notes FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Notes.fxml"));
            Parent notesRoot = loader.load();

            // Create a new scene for the notes
            Scene notesScene = new Scene(notesRoot, 600, 400); // Set the width and height as needed

            // Get the current stage
            Stage currentStage = (Stage) noteButton1.getScene().getWindow();
            currentStage.setScene(notesScene); // Set the new scene
            currentStage.show(); // Show the new scene
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions that occur during loading
        }
    }

    @FXML
    private void handleAction3() {
        try {
            // Load the notes FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Flashcard.fxml"));
            Parent notesRoot = loader.load();

            // Create a new scene for the notes
            Scene notesScene = new Scene(notesRoot, 600, 400); // Set the width and height as needed

            // Get the current stage
            Stage currentStage = (Stage) noteButton1.getScene().getWindow();
            currentStage.setScene(notesScene); // Set the new scene
            currentStage.show(); // Show the new scene
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions that occur during loading
        }
    }

    @FXML
    private void handleAction4() {
        try {
            // Load the notes FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("To-Do List.fxml"));
            Parent notesRoot = loader.load();

            // Create a new scene for the notes
            Scene notesScene = new Scene(notesRoot, 600, 400); // Set the width and height as needed

            // Get the current stage
            Stage currentStage = (Stage) noteButton1.getScene().getWindow();
            currentStage.setScene(notesScene); // Set the new scene
            currentStage.show(); // Show the new scene
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions that occur during loading
        }
    }
    @FXML
    private Button BackButton;

    @FXML
    private void BackButton() {
        try {
            // Load the notes FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
            Parent notesRoot = loader.load();

            // Create a new scene for the notes
            Scene notesScene = new Scene(notesRoot, 600, 400); // Set the width and height as needed

            // Get the current stage
            Stage currentStage = (Stage) BackButton.getScene().getWindow();
            currentStage.setScene(notesScene); // Set the new scene
            currentStage.show(); // Show the new scene
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions that occur during loading
        }
    }
}