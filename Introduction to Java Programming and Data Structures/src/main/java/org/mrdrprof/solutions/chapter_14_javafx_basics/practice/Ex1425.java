package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * @author Alex Golub
 * @since July 22, 2023 12:08 PM
 */
public class Ex1425 extends Application {

    private static final double CENTER_X = 200;
    private static final double CENTER_Y = 200;
    private static final double RADIUS = 150;
    private static final int NUM_POINTS = 5;
    private static final Random RANDOM = new Random();

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Circle circle = new Circle(CENTER_X, CENTER_Y, RADIUS);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);

        double[] randomAngles = getRandomAngles();

        Polygon polygon = new Polygon();
        polygon.setFill(Color.TRANSPARENT);
        polygon.setStroke(Color.BLACK);

        for (int i = 0; i < NUM_POINTS; i++) {
            double x = CENTER_X + RADIUS * Math.cos(randomAngles[i]);
            double y = CENTER_Y + RADIUS * Math.sin(randomAngles[i]);

            polygon.getPoints().addAll(x, y);
        }

        pane.getChildren().addAll(circle, polygon);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double[] getRandomAngles() {
        return DoubleStream.generate(() -> 2 * Math.PI * RANDOM.nextDouble())
                           .limit(NUM_POINTS)
                           .sorted()
                           .toArray();
    }
}
