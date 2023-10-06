package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * *15.27 (Control a moving text) Write a program that displays a moving text, as shown
 * in Figures 15.35a and b. The text moves from left to right circularly. When it
 * disappears in the right, it reappears from the left. The text freezes when the
 * mouse is pressed, and moves again when the button is released.
 *
 * @author Alex Golub
 * @since October 06, 2023 9:05 PM
 */
public class Ex1527 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        double width = 400;
        double height = 400;
        Scene scene = new Scene(pane, width, height);
        double radius = Math.min(width, height) * 0.25;
        Circle c = new Circle(width / 2, height / 2, radius, Color.TRANSPARENT);
        c.setRotate(180);
        c.setStroke(Color.BLACK);
        Text text = new Text("Programming is fun");

        PathTransition pathTransition = new PathTransition(Duration.millis(10000), c, text);
        pathTransition.setCycleCount(Animation.INDEFINITE);
        pathTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(5000), text);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0);
        fadeTransition.setAutoReverse(true);
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.play();

        pane.setOnMousePressed(e -> {
            pathTransition.pause();
            fadeTransition.pause();
        });
        pane.setOnMouseReleased(e -> {
            pathTransition.play();
            fadeTransition.play();
        });

        pane.getChildren().addAll(text);
        primaryStage.setScene(scene);
        primaryStage.setTitle("*Ex1527");
        primaryStage.show();
    }
}
