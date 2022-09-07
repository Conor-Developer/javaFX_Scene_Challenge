package com.example.javafxscenechallenge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(StartApplication.class.getResource("scene1.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(StartApplication.class.getResource("scene2.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load(), 320, 240);
        Scene scene2 = new Scene(fxmlLoader2.load(), 320, 240);

        Scene2Controller secondSceneController = (Scene2Controller) fxmlLoader2.getController();
        secondSceneController.setScene(scene1);

        Scene1Controller firstSceneController = (Scene1Controller) fxmlLoader1.getController();
        firstSceneController.setScene(scene2);

        stage.setTitle("Change Scene");
        stage.setScene(scene1);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}