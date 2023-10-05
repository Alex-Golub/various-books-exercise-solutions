package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * *15.16 (Two movable vertices and their distances) Write a program that displays two
 * circles with radius 10 at location (40, 40) and (120, 150) with a line connecting the two circles, as shown in Figure 15.30b. The distance between the circles
 * is displayed along the line. The user can drag a circle. When that happens, the
 * circle and its line are moved, and the distance between the circles is updated.
 * 
 * @author Alex Golub
 * @since October 06, 2023 1:18 PM
 */
public class Ex1516 extends Application {

    private Circle circle1;
    private Circle circle2;
    private Line line;
    private Text distanceText;

    private double offsetX1;
    private double offsetY1;
    private double offsetX2;
    private double offsetY2;

    private static final double PANE_WIDTH = 400;
    private static final double PANE_HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        circle1 = createMovableCircle(40, 40);
        circle2 = createMovableCircle(120, 150);
        line = new Line();
        distanceText = new Text();

        pane.getChildren().addAll(line, circle1, circle2, distanceText);

        updateLineAndDistance();

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("*Ex1516");
        primaryStage.setScene(scene);
        primaryStage.show();

        setupMouseEvents();
    }

    private Circle createMovableCircle(double centerX, double centerY) {
        Circle circle = new Circle(centerX, centerY, 10);
        circle.setStyle("-fx-fill: lightblue; -fx-stroke: black; -fx-stroke-width: 2;");
        return circle;
    }

    private void updateLineAndDistance() {
        double x1 = circle1.getCenterX();
        double y1 = circle1.getCenterY();
        double x2 = circle2.getCenterX();
        double y2 = circle2.getCenterY();

        line.setStartX(x1);
        line.setStartY(y1);
        line.setEndX(x2);
        line.setEndY(y2);

        double distance = calculateDistance(x1, y1, x2, y2);
        distanceText.setText(String.format("%.2f", distance));
        
        // distance text location
        distanceText.setX((x1 + x2) / 2);
        distanceText.setY((y1 + y2) / 2);
    }

    private double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private void setupMouseEvents() {
        circle1.setOnMousePressed(e -> {
            offsetX1 = e.getSceneX() - circle1.getCenterX();
            offsetY1 = e.getSceneY() - circle1.getCenterY();
        });

        circle1.setOnMouseDragged(e -> {
            double newX = e.getSceneX() - offsetX1;
            double newY = e.getSceneY() - offsetY1;

            // Check if the new position is within the pane bounds
            if (newX >= 0 && newX <= PANE_WIDTH && newY >= 0 && newY <= PANE_HEIGHT) {
                circle1.setCenterX(newX);
                circle1.setCenterY(newY);
                updateLineAndDistance();
            }
        });

        circle2.setOnMousePressed(e -> {
            offsetX2 = e.getSceneX() - circle2.getCenterX();
            offsetY2 = e.getSceneY() - circle2.getCenterY();
        });

        circle2.setOnMouseDragged(e -> {
            double newX = e.getSceneX() - offsetX2;
            double newY = e.getSceneY() - offsetY2;

            // Check if the new position is within the pane bounds
            if (newX >= 0 && newX <= PANE_WIDTH && newY >= 0 && newY <= PANE_HEIGHT) {
                circle2.setCenterX(newX);
                circle2.setCenterY(newY);
                updateLineAndDistance();
            }
        });
    }
}
