package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Text text = new Text(20, 50, "Programming is fun");
        text.setFill(Color.RED);
        pane.getChildren().add(text); // Place text into the stack pane

        // Create a handler for changing text
        EventHandler<ActionEvent> eventHandler = actionEvent -> {
            if (text.getText().isEmpty()) {
                text.setText("Programming is fun");
            } else {
                text.setText("");
            }
        };

        // Create an animation for alternating text
        KeyFrame keyFrame = new KeyFrame(Duration.millis(500), eventHandler);
        Timeline animation = new Timeline(keyFrame);
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play(); // Start animation

        // Pause and resume animation
        text.setOnMouseClicked(e -> {
            if (animation.getStatus() == Animation.Status.PAUSED) {
                animation.play();
            } else {
                animation.pause();
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 50);
        primaryStage.setTitle("TimelineDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
