package com.example.thefitfulapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class calculateBmi {

    @FXML
    private Label bmiValue;

//    @FXML
//    private Button calculateButton;

    @FXML
    private Label category;

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;


    public void calculateBMI(){

        DecimalFormat decfor = new DecimalFormat("0.00");

        float a = Float.parseFloat(heightField.getText());
        float b = Float.parseFloat(weightField.getText());
        float bmi = b/(a*a) * 703;

        bmiValue.setText( ""+ decfor.format(bmi));

        if (bmi <= 18.4){
            category.setText("Underweight");
        }else if (bmi <= 24.9){
            category.setText("Normal Weight");
        }else if (bmi <= 39.9){
            category.setText("Overweight");
        }else {
            category.setText("Obese");
        }

    }




}
