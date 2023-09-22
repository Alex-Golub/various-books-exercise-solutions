package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class USMap extends Application {

    @Override
    public void start(Stage primaryStage) {
        MapPane map = new MapPane();
        Scene scene = new Scene(map, 1200, 800);
        primaryStage.setTitle("USMap"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        map.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                map.enlarge(); // Enlarge the map
            } else if (e.getCode() == KeyCode.DOWN) {
                map.shrink(); // Shrink the map
            }
        });
        map.requestFocus(); // LINE 29
    }
}
