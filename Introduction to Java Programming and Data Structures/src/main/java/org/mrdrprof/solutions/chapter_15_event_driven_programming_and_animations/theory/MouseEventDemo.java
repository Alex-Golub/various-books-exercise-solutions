package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();
        Text text = new Text(20, 20, "Programming is fun");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());

            System.out.printf("x: %.2f, y: %.2f%n", e.getX(), e.getY());
        });


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("MouseEventDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
} 
