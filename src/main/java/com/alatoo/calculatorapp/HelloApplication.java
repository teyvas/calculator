package com.alatoo.calculatorapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 320, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
