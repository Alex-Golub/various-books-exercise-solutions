package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

  public static final int SCENE_WIDTH = 200;
  public static final int SCENE_HEIGHT = 200;

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circle = new Circle(SCENE_HEIGHT / 2.0,
                               SCENE_WIDTH / 2.0,
                               SCENE_HEIGHT / 4.0,
                               Color.WHITE);
    circle.setStroke(Color.BLACK); // Set circle stroke color

    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().add(circle);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
    primaryStage.setTitle("ShowCircleKt"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
}
