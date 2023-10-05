package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * **15.12 (Geometry: inside a circle?) Write a program that draws a fixed circle centered
 * at (100, 60) with radius 50. Whenever the mouse is moved, display a message
 * indicating whether the mouse point is inside the circle at the mouse point or
 * outside of it, as shown in Figure 15.29a.
 *
 * @author Alex Golub
 * @since October 05, 2023 8:05 PM
 */
public class Ex1512 extends Application {

    static final double WIDTH = 400;
    static final double HEIGHT = 400;
    static final String MESSAGE_TEMPLATE = "Mouse point is %s the circle";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(100, 60, 150, Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        Text text = new Text();
        text.setFont(Font.font("JetBrains Mono", 13));
        StackPane stackPane = new StackPane(text, circle);

        circle.setOnMouseEntered(e -> text.setText(MESSAGE_TEMPLATE.formatted("inside")));
        circle.setOnMouseExited(e -> text.setText(MESSAGE_TEMPLATE.formatted("outside")));

        primaryStage.setScene(new Scene(stackPane, WIDTH, HEIGHT));
        primaryStage.setTitle("**Ex1512");
        primaryStage.show();
    }
}
