package com.example.thefitfulapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button calculateBmi;

    @FXML
    private Button trackCalories;

    @FXML
    void calculateBmi(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calculateBmi.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            Stage stage = new Stage();

            stage.setTitle("BMI Calculator");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("error");
        }

    }

    @FXML
    void trackCalories(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("trackCalories.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            Stage stage = new Stage();

            stage.setTitle("TDEE Calculator");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("error");
        }

    }

}
