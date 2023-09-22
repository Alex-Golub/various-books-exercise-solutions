package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
  @Override
  public void start(Stage primaryStage) {
    // Create a scene and place a button in the scene
    StackPane pane = new StackPane();
    Button btOK = new Button("OK");
    btOK.setStyle("-fx-border-color: blue; " +
                  "-fx-text-fill: red; " +
                  "-fx-rotate: -15;" +
                  "-fx-scale-x: 1.5;" +
                  "-fx-scale-y: 1.5");
    pane.getChildren().add(btOK);
    
    pane.setRotate(45); // Rotate pane 45 degrees
    pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
    
    Scene scene = new Scene(pane, 200, 250);
    primaryStage.setTitle("org.mrdrprof.solutions.chapter_14_javafx_basics.NodeStyleRotateDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
}
