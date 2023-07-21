package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author Alex Golub
 * @since July 17, 2023 7:08 PM
 */
public class MultipleStagesExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the primary stage
        primaryStage.setTitle("Primary Stage");
        Button button = new Button("Open New Stage");
        button.setOnAction(event -> openNewStage());
        Scene scene = new Scene(button, 200, 200);
        primaryStage.setScene(scene);

        // Show the primary stage
        primaryStage.show();
    }

    private void openNewStage() {
        // Create a new stage
        Stage newStage = new Stage();
        newStage.setTitle("New Stage");
        Button close = new Button("Close");
        close.setOnAction(event -> closeStage(newStage));
        Scene scene = new Scene(close, 200, 200);
        newStage.setScene(scene);

        // Show the new stage
        newStage.show();
    }

    private void closeStage(Stage newStage) {
        newStage.close();
    }
}
