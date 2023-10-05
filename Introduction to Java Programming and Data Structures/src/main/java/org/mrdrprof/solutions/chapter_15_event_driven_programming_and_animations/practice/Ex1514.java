package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * **15.14 (Geometry: inside a polygon?) Write a program that draws a fixed polygon
 * with points at (40, 20), (70, 40), (60, 80), (45, 45), and (20, 60). Whenever
 * the mouse is moved, display a message indicating whether the mouse point
 * is inside the polygon at the mouse point or outside of it, as shown in Figure
 * 15.29c. To detect whether a point is inside a polygon, use the contains
 * method defined in the Node class.
 *
 * @author Alex Golub
 * @since October 05, 2023 8:33 PM
 */
public class Ex1514 extends Application {

    static final double WIDTH = 400;
    static final double HEIGHT = 400;
    static final String MESSAGE_TEMPLATE = "Mouse point is %s the polygon";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Polygon polygon = new Polygon(40, 20,
                                      70, 40,
                                      60, 80,
                                      45, 45,
                                      20, 60);
        polygon.setFill(Color.TRANSPARENT);
        polygon.setStroke(Color.BLACK);
        polygon.setStrokeWidth(2);

        Text text = new Text();
        text.setFont(Font.font("JetBrains Mono", 13));
        StackPane stackPane = new StackPane(text, polygon);

        polygon.setOnMouseEntered(e -> text.setText(MESSAGE_TEMPLATE.formatted("inside")));
        polygon.setOnMouseExited(e -> text.setText(MESSAGE_TEMPLATE.formatted("outside")));

        primaryStage.setScene(new Scene(stackPane, WIDTH, HEIGHT));
        primaryStage.setTitle("**Ex1514");
        primaryStage.show();
    }
}
