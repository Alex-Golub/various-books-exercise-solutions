package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * *15.7 (Change color using a mouse) Write a program that displays the color of a
 * circle as black when the mouse button is pressed, and as white when the mouse
 * button is released.
 *
 * @author Alex Golub
 * @since October 03, 2023 8:26 PM
 */
public class Ex1507 extends Application {

    static final double MIN_HEIGHT = 300;
    static final double MIN_WIDTH = 300;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(MIN_WIDTH / 2, MIN_HEIGHT / 2, MIN_HEIGHT / 4);
        circle.setStroke(Color.BLACK);
        circle.setOnMousePressed(e -> circle.setFill(Color.TRANSPARENT));
        circle.setOnMouseReleased(e -> circle.setFill(Color.BLACK));

        StackPane stackPane = new StackPane(circle);
        stackPane.setMinHeight(MIN_HEIGHT);
        stackPane.setMinWidth(MIN_WIDTH);
        stackPane.setAlignment(Pos.CENTER);

        primaryStage.setScene(new Scene(stackPane, MIN_WIDTH, MIN_HEIGHT));
        primaryStage.setTitle("Ex1507");
        primaryStage.show();
    }
}
