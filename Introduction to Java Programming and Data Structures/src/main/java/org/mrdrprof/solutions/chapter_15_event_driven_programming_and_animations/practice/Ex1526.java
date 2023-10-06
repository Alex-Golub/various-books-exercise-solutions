package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * *15.26 (Change opacity) Rewrite Programming Exercise 15.24 so the ball’s opacity is
 * changed as it swings.
 *
 * @author Alex Golub
 * @since October 06, 2023 9:02 PM
 */
public class Ex1526 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane 
        Pane pane = new Pane();

        Circle circle = new Circle(0, 0, 10);
        circle.setFill(Color.ORANGE);

        Arc arc = new Arc(125, 100, 80, 40, 210, 125);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);

        // Add circle and rectangle to the pane
        pane.getChildren().add(arc);
        pane.getChildren().add(circle);

        // Create a path transition 
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(arc);
        pt.setNode(circle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Animation.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play(); // Start animation 

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(3000), circle);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();

        pane.setOnMousePressed(e -> pt.pause());
        pane.setOnMouseReleased(e -> pt.play());

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("*Ex1526"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
