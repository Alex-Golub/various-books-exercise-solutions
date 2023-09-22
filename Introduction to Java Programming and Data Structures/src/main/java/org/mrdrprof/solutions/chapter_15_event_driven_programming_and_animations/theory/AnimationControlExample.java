package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationControlExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(50);
        circle.setStyle("-fx-fill: blue;");

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Animation Control Example");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Create a simple scaling animation for the circle
        Timeline animation = new Timeline(
                new KeyFrame(Duration.seconds(2), event -> {
                    // Scale the circle up
                    circle.setScaleX(2.0);
                    circle.setScaleY(2.0);
                }),
                new KeyFrame(Duration.seconds(4), event -> {
                    // Reset the scale to normal
                    circle.setScaleX(1.0);
                    circle.setScaleY(1.0);
                })
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.setAutoReverse(true);

        // Start the animation
        animation.play();

        // Pause the animation after 6 seconds
        new Timeline(new KeyFrame(Duration.seconds(6), e -> animation.pause())).play();

        // Resume the animation after 10 seconds
        new Timeline(new KeyFrame(Duration.seconds(10), e -> animation.play())).play();

        // Stop the animation after 15 seconds
        new Timeline(new KeyFrame(Duration.seconds(15), e -> animation.stop())).play();
    }
}
