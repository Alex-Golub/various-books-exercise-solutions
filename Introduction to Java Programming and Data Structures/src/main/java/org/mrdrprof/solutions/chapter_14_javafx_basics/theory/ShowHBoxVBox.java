package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {

  @Override
  public void start(Stage primaryStage) {
    BorderPane borderPane = new BorderPane();

    // Place nodes in the borderPane
    borderPane.setTop(getHBox());
    borderPane.setLeft(getVBox());

    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane);
    primaryStage.setTitle("ShowHBoxVBox"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  private HBox getHBox() {
    HBox hBox = new HBox(15); // Create an HBox with 15px spacing
    hBox.setPadding(new Insets(15));
    hBox.setStyle("-fx-background-color: #b7a968; " +
                  "-fx-border-color: black;");
    Button computerScience = new Button("Computer Science");
    Button chemistry = new Button("Chemistry");
    chemistry.setStyle("-fx-border-color: blue");
    computerScience.setStyle("-fx-border-color: red");
    hBox.getChildren().addAll(computerScience, chemistry);
    ImageView imageView = new ImageView(new Image("http://liveexample.pearsoncmg.com/book/image/us.gif"));
    hBox.getChildren().add(imageView);

    return hBox;
  }

  private VBox getVBox() {
    VBox vBox = new VBox(15); // Create a VBox with 15px spacing
    vBox.setPadding(new Insets(15, 5, 5, 5));
    vBox.setStyle("-fx-background-color: #88dc9a; " +
                  "-fx-border-color: black;");
    vBox.getChildren().add(new Label("Courses"));

    Label[] courses = {
            new Label("CSCI 1301"),
            new Label("CSCI 1302"),
            new Label("CSCI 2410"),
            new Label("CSCI 3720")
    };

    for (Label course : courses) {
      VBox.setMargin(course, new Insets(0, 0, 0, 15));
      vBox.getChildren().add(course);
    }

    return vBox;
  }
} 
