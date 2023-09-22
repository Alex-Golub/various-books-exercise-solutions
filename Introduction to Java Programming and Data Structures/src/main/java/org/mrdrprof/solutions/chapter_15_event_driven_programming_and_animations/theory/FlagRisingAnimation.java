package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane 
        Pane pane = new Pane();

        // Add an image view and add it to pane
        ImageView imageView = new ImageView("C:\\dev\\various-books-exercise-solutions\\Introduction to Java Programming and Data Structures\\src\\main\\java\\org\\mrdrprof\\solutions\\chapter_15_event_driven_programming_and_animations\\image\\us.gif");
        pane.getChildren().add(imageView);

        // Create a path transition 
        PathTransition pt = new PathTransition(Duration.millis(2500),
                                               new Line(100, 200, 100, 50),
                                               imageView);
        pt.setAutoReverse(true);
        pt.setCycleCount(Animation.INDEFINITE);
        pt.play(); // Start animation 

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
