package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.mrdrprof.solutions.chapter_14_javafx_basics.theory.ClockPane;

public class ClockAnimation extends Application {

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane(); // Create a clock

        // Create a handler for animation
        EventHandler<ActionEvent> eventHandler = e -> clock.setCurrentTime();

        // Create an animation for a running clock
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),
                                                       eventHandler));
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play(); // Start animation

        // Create a scene and place it in the stage
        Scene scene = new Scene(clock, 250, 250);
        primaryStage.setTitle("ClockAnimation"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
