package com.example.thefitfulapp;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class trackCalories {

    @FXML
    private ComboBox<String> activityMenu;

    @FXML
    private TextField ageField;

    @FXML
    private Label dailyCalorieBurn;

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;

    @FXML
    public void initialize() {
        activityMenu.setItems(FXCollections.observableArrayList("Light", "Moderate", "Intense"));
    }


    public void calculateCalories(){

        float a = Float.parseFloat(heightField.getText());
        float b = Float.parseFloat(weightField.getText());
        float c = Float.parseFloat(ageField.getText());
        double e = 0;

        String act1 = "Light";
        String act2 = "Moderate";
        String act3 = "Intense";


        String d = activityMenu.getValue();

        if (act1.equals(d)){
             e = 1.37;
        } else if (act2.equals(d)){
            e = 1.55;
        }else if (act3.equals(d)){
            e = 1.725;
        }

        int cals = (int) ((66 + (6.2 * b) + (12.7 * a) - (6.67 * c)) * e);

        dailyCalorieBurn.setText(""+ cals + " calories/day");

    }


}
