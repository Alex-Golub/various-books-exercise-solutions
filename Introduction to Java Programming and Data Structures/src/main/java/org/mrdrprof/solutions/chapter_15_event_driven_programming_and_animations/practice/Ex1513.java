package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * **15.13 (Geometry: inside a rectangle?) Write a program that draws a fixed rectangle centered at (100, 60) with width 100 and height 40.
 * Whenever the mouse is moved, display a message indicating whether the mouse point is inside the rectangle at the
 * mouse point or outside of it, as shown in Figure 15.29b. To detect whether a point
 * is inside a polygon, use the contains method defined in the Node class.
 *
 * @author Alex Golub
 * @since October 05, 2023 8:27 PM
 */
public class Ex1513 extends Application {

    static final double WIDTH = 400;
    static final double HEIGHT = 400;
    static final String MESSAGE_TEMPLATE = "Mouse point is %s the rectangle";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rectangle = new Rectangle(100, 60, 200, 80);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        Text text = new Text();
        text.setFont(Font.font("JetBrains Mono", 13));
        StackPane stackPane = new StackPane(text, rectangle);

        rectangle.setOnMouseEntered(e -> text.setText(MESSAGE_TEMPLATE.formatted("inside")));
        rectangle.setOnMouseExited(e -> text.setText(MESSAGE_TEMPLATE.formatted("outside")));

        primaryStage.setScene(new Scene(stackPane, WIDTH, HEIGHT));
        primaryStage.setTitle("**Ex1513");
        primaryStage.show();
    }
}
