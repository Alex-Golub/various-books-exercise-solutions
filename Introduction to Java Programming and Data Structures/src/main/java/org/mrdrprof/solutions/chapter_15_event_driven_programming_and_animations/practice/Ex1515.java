package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * **15.15 (Geometry: add and remove points) Write a program that lets the user click on
 * a pane to dynamically create and remove points (see Figure 15.30a). When the
 * user left-clicks the mouse (primary button), a point is created and displayed
 * at the mouse point. The user can remove a point by pointing to it and rightclicking the mouse (secondary button).
 *
 * @author Alex Golub
 * @since October 05, 2023 8:37 PM
 */
public class Ex1515 extends Application {

    static final double WIDTH = 400;
    static final double HEIGHT = 400;
    static final double POINT_RADIUS = 10;
    static final double STROKE_WIDTH = 2;
    static final Pane PANE = new Pane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        PANE.setOnMouseClicked(event -> {
            double x = event.getX();
            double y = event.getY();

            switch (event.getButton()) {
                case PRIMARY -> addPoint(x, y);
                case SECONDARY -> removePoint(x, y);
                default -> System.err.println("Mouse key " + event.getButton() + " is not supported");
            }
        });

        primaryStage.setScene(new Scene(PANE, WIDTH, HEIGHT));
        primaryStage.setTitle("**Ex1515");
        primaryStage.show();
    }

    private void removePoint(double x, double y) {
        for (Node node : PANE.getChildren()) {
            if (node instanceof Circle circle && node.contains(x, y)) {
                PANE.getChildren().remove(node);
                System.out.printf(">> removePoint(double %.2f, double %.2f)%n", circle.getCenterX(), circle.getCenterY());
                break;
            }
        }
    }

    private static void addPoint(double x, double y) {
        Circle point = new Circle(x, y, POINT_RADIUS, Color.TRANSPARENT);
        point.setStrokeWidth(STROKE_WIDTH);
        point.setStroke(Color.BLACK);

        PANE.getChildren().add(point);
        System.out.printf(">> addPoint(double %.1f, double %.1f)%n", x, y);
    }
}
