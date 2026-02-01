package com.example.securepasswordgeneratorjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.io.IOException;



public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Password Generator");

        Label passwordLengthLabel = new Label("Password length: ");
        TextField passwordLengthField = new TextField();
        passwordLengthField.setText("8"); // Length suggestion

        Label generatedPasswordLabel = new Label("Generated password: ");
        TextField generatedPasswordField = new TextField();
        generatedPasswordField.setEditable(false);

        Button generateButton = new Button("Generate Password");
        generateButton.setOnAction(e -> {
            int passwordLength = Integer.parseInt(passwordLengthField.getText()); // Pulls user's length
            String password = PasswordGenerator.generatePassword(passwordLength); // Generate password
            generatedPasswordField.setText(password); // Shows generated password to the user
        });

        generatedPasswordField.setStyle("-fx-text-fill: cyan; -fx-background-color: black");
        passwordLengthLabel.setStyle("-fx-text-fill: white; -fx-font-weight: bold");
        generatedPasswordLabel.setStyle("-fx-text-fill: white; -fx-font-weight: bold");
        generateButton.setStyle("-fx-text-fill: white; -fx-background-color: #3574F0;");

        VBox vbox = new VBox(passwordLengthLabel, passwordLengthField, generateButton, generatedPasswordLabel, generatedPasswordField);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));
        vbox.setStyle("-fx-background-color: #2B2D30");
        Scene scene = new Scene(vbox, 250, 200);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}