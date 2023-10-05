package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * **15.6 (Alternate two messages) Write a program to display the text Java is fun
 * and Java is powerful alternately with a mouse click.
 *
 * @author Alex Golub
 * @since October 01, 2023 2:56 PM
 */
public class Ex1506 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String s1 = "Java is fun";
        String s2 = "Java is powerful";

        StackPane stackPane = new StackPane();
        Text text = new Text(s1);
        text.setFont(Font.font(32));
        stackPane.getChildren().add(text);
        stackPane.setOnMouseClicked(event -> text.setText(text.getText().equals(s1) ? s2 : s1));

        primaryStage.setScene(new Scene(stackPane, 300, 300));
        primaryStage.setTitle("Ex1506");
        primaryStage.show();
    }
}
