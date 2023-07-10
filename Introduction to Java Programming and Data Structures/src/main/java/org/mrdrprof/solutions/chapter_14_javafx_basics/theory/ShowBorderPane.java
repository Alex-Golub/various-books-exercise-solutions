package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
  @Override
  public void start(Stage primaryStage) {
    // Create a border borderPane 
    BorderPane borderPane = new BorderPane();

    // Place nodes in the borderPane
    borderPane.setTop(new CustomPane("Top"));
    borderPane.setRight(new CustomPane("Right"));
    borderPane.setBottom(new CustomPane("Bottom"));
    borderPane.setLeft(new CustomPane("Left"));
    borderPane.setCenter(new CustomPane("Center"));

    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane);
    primaryStage.setTitle("ShowBorderPane"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
}

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane {
  public CustomPane(String title) {
    getChildren().add(new Label(title));
    setStyle("-fx-border-color: red");
    setPadding(new Insets(20));
  }
}
