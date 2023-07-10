package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
  @Override
  public void start(Stage primaryStage) {
    FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
    flowPane.setPadding(new Insets(11, 12, 13, 14));
    flowPane.setHgap(5); // Set hGap to 5px
    flowPane.setVgap(5);

    // Apply styles to the flowPane
    flowPane.setStyle("-fx-background-color: lightgray; " +
                      "-fx-border-color: black; " +
                      "-fx-padding: 10px;");

    // Place nodes in the flowPane
    Label firstNameLabel = new Label("First Name:");
    firstNameLabel.setStyle("-fx-border-color: black; " +
                            "-fx-padding: 5px;");
    TextField firstNameTextField = new TextField();
    Label miLabel = new Label("MI:");
    miLabel.setStyle("-fx-border-color: black; " +
                     "-fx-padding: 5px;");

    flowPane.getChildren().addAll(firstNameLabel, firstNameTextField, miLabel);

    TextField textField = new TextField();
    textField.setPrefColumnCount(1);
    Label lastNameLabel = new Label("Last Name:");
    lastNameLabel.setStyle("-fx-border-color: black; " +
                           "-fx-padding: 5px;");
    TextField lastNameTextField = new TextField();

    flowPane.getChildren().addAll(textField, lastNameLabel, lastNameTextField);

    // Create a scene and place it in the stage
    Scene scene = new Scene(flowPane, 200, 250);
    primaryStage.setTitle("ShowFlowPane"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
}
