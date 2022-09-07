package com.example.javafxscenechallenge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Scene1Controller {

    private Scene secondScene;
    @FXML
    protected void setScene(Scene scene) {
        secondScene = scene;
    }

    @FXML
    protected void openScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
    }
}