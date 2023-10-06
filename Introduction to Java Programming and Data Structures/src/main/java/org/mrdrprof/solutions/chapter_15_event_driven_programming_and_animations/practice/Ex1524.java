package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * **15.24 (Animation: pendulum swing) Write a program that animates a pendulum
 * swing, as shown in Figure 15.33. Press/release the mouse to pause/resume the
 * animation.
 *
 * @author Alex Golub
 * @since October 06, 2023 8:57 PM
 */
public class Ex1524 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();

        Circle circle = new Circle(0, 0, 10);
        circle.setFill(Color.ORANGE);

        Arc arc = new Arc(125, 100, 80, 40, 210, 125);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);

        // Add circle and rectangle to the group
        group.getChildren().add(arc);
        group.getChildren().add(circle);

        // Create a path transition 
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(arc);
        pathTransition.setNode(circle);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Animation.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();

        group.setOnMousePressed(e -> pathTransition.pause());
        group.setOnMouseReleased(e -> pathTransition.play());

        // Create a scene and place it in the stage
        Scene scene = new Scene(new BorderPane(group), 250, 200);
        primaryStage.setTitle("**Ex1524"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
