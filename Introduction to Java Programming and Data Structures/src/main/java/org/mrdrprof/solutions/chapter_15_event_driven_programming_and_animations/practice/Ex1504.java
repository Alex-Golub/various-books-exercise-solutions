package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * *15.4 (Create a simple calculator) Write a program to perform addition, subtraction,
 * multiplication, and division, as shown in Figure 15.27a.
 *
 * @author Alex Golub
 * @since October 01, 2023 2:05 PM
 */
public class Ex1504 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setHgap(2);
        pane.setAlignment(Pos.CENTER);
        TextField tfNumber1 = new TextField();
        TextField tfNumber2 = new TextField();
        TextField tfResult = new TextField();
        tfResult.setEditable(false);

        pane.getChildren()
            .addAll(new Label("Number 1: "), tfNumber1,
                    new Label("Number 2: "), tfNumber2,
                    new Label("Result: "), tfResult);

        // Create four buttons
        HBox hBox = new HBox(5);
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button btMultiply = new Button("Multiply");
        Button btDivide = new Button("Divide");
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren()
            .addAll(btAdd, btSubtract, btMultiply, btDivide);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.TOP_CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 400, 200);
        primaryStage.setTitle("Simple calculator"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        btAdd.setOnAction(e -> tfResult.setText(Double.parseDouble(tfNumber1.getText()) +
                                                Double.parseDouble(tfNumber2.getText()) + ""));

        btSubtract.setOnAction(e -> tfResult.setText(Double.parseDouble(tfNumber1.getText()) -
                                                     Double.parseDouble(tfNumber2.getText()) + ""));

        btMultiply.setOnAction(e -> tfResult.setText(Double.parseDouble(tfNumber1.getText()) *
                                                     Double.parseDouble(tfNumber2.getText()) + ""));

        btDivide.setOnAction(e -> tfResult.setText(Double.parseDouble(tfNumber1.getText()) /
                                                   Double.parseDouble(tfNumber2.getText()) + ""));
    }
}
