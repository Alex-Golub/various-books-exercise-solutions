package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

/**
 * *14.21 (Two circles and their distance) Write a program that draws two circles with
 * radius 15 pixels, centered at random locations, with a line connecting the two
 * circles. The distance between the two centers is displayed on the line, as shown
 * in Figure 14.49b.
 *
 * @author Alex Golub
 * @since July 22, 2023 11:33 AM
 */
public class Ex1421 extends Application {

    private static final double CIRCLE_RADIUS = 15;
    private static final double LINE_WIDTH = 2;
    private static final double PANE_WIDTH = 400;
    private static final double PANE_HEIGHT = 300;
    private static final Random RANDOM = new Random();

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Generate random center points for the two circles
        double centerX1 = getRandomDouble(CIRCLE_RADIUS, PANE_WIDTH - CIRCLE_RADIUS);
        double centerY1 = getRandomDouble(CIRCLE_RADIUS, PANE_HEIGHT - CIRCLE_RADIUS);

        double centerX2 = getRandomDouble(CIRCLE_RADIUS, PANE_WIDTH - CIRCLE_RADIUS);
        double centerY2 = getRandomDouble(CIRCLE_RADIUS, PANE_HEIGHT - CIRCLE_RADIUS);

        // Draw the circles
        Circle circle1 = new Circle(centerX1, centerY1, CIRCLE_RADIUS);
        Circle circle2 = new Circle(centerX2, centerY2, CIRCLE_RADIUS);

        // Calculate the distance between the two centers
        double distance = calculateDistance(centerX1, centerY1, centerX2, centerY2);

        // Draw the line connecting the centers
        Line line = new Line(centerX1, centerY1, centerX2, centerY2);
        line.setStrokeWidth(LINE_WIDTH);

        // Draw the text displaying the distance on the line
        double textX = (centerX1 + centerX2) / 2;
        double textY = (centerY1 + centerY2) / 2;
        Text distanceText = new Text(textX, textY, "%.4f".formatted(distance));

        pane.getChildren().addAll(circle1, circle2, line, distanceText);

        Scene scene = new Scene(pane, PANE_WIDTH, PANE_HEIGHT);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double getRandomDouble(double min, double max) {
        return min + (max - min) * RANDOM.nextDouble();
    }

    private double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
