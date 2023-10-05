package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * **15.17 (Geometry: find the bounding rectangle) Write a program that enables the user
 * to add and remove points in a two-dimensional plane dynamically, as shown
 * in Figure 15.31a. A minimum bounding rectangle is updated as the points are
 * added and removed. Assume the radius of each point is 10 pixels.
 *
 * @author Alex Golub
 * @since October 06, 2023 2:10 PM
 */
public class Ex1517 extends Application {

    private final List<Circle> points = new ArrayList<>();
    private final Rectangle boundingRectangle = new Rectangle();
    private static final double WIDTH = 400;
    private static final double HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, WIDTH, HEIGHT);

        boundingRectangle.setFill(Color.TRANSPARENT);
        boundingRectangle.setStroke(Color.RED);
        boundingRectangle.setStrokeWidth(2);

        pane.getChildren().add(boundingRectangle);

        scene.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                Circle point = createPoint(event.getX(), event.getY());
                points.add(point);
                pane.getChildren().add(point);
            } else if (event.getButton() == MouseButton.SECONDARY) {
                removePoint(event.getX(), event.getY());
            }

            updateBoundingRectangle();
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("**Ex1517");
        primaryStage.show();
    }

    private Circle createPoint(double x, double y) {
        Circle circle = new Circle(x, y, 5);
        circle.setFill(Color.BLUE);
        return circle;
    }

    private void updateBoundingRectangle() {
        if (points.isEmpty()) {
            boundingRectangle.setWidth(0);
            boundingRectangle.setHeight(0);
            return;
        }

        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE;
        double maxY = Double.MIN_VALUE;

        for (Circle point : points) {
            double x = point.getCenterX();
            double y = point.getCenterY();

            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        boundingRectangle.setX(minX - 5);
        boundingRectangle.setY(minY - 5);
        boundingRectangle.setWidth(maxX - minX + 10);
        boundingRectangle.setHeight(maxY - minY + 10);
    }

    private void removePoint(double x, double y) {
        for (Circle point : points) {
            if (point.contains(x, y)) {
                points.remove(point);
                point.setVisible(false);
                return;
            }
        }
    }
}
