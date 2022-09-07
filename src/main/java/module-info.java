module com.example.javafxscenechallenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxscenechallenge to javafx.fxml;
    exports com.example.javafxscenechallenge;
}