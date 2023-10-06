module com.example.thefitfulapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thefitfulapp to javafx.fxml;
    exports com.example.thefitfulapp;
}