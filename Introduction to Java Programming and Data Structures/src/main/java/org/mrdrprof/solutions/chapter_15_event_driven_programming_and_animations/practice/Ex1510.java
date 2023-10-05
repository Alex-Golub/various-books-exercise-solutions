package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * **15.10 (Enter and display a string) Write a program that receives a string from the
 * keyboard and displays it on a pane. The Enter key signals the end of a string.
 * Whenever a new string is entered, it is displayed on the pane.
 *
 * @author Alex Golub
 * @since October 05, 2023 7:32 PM
 */
public class Ex1510 extends Application {

    static final StringBuilder BUILDER = new StringBuilder();
    static final double WIDTH = 400;
    static final double HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("Keyboard entered letters/keys will be displayed here");
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(text);

        stackPane.setFocusTraversable(true); // pane can be focused using TAB or ALT+TAB
        stackPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                text.setText(BUILDER.toString());
                BUILDER.delete(0, BUILDER.length()); // clear buffer
            } else {
                BUILDER.append(e.getText());
            }
        });

        primaryStage.setScene(new Scene(stackPane, WIDTH, HEIGHT));
        primaryStage.setTitle("**EX1510");
        primaryStage.show();

        stackPane.requestFocus();
    }
}
