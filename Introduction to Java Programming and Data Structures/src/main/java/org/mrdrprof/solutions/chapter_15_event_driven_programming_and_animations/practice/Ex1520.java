package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * **15.20 (Geometry: display angles) Write a program that enables the user to drag the
 * vertices of a triangle and displays the angles dynamically as the triangle shape
 * changes, as shown in Figure 15.32a. The formula to compute angles is given in
 * Listing 4.1.
 *
 * @author Alex Golub
 * @since October 06, 2023 6:59 PM
 */
public class Ex1520 extends Application {

    private final Circle[] circle = { new Circle(40, 40, 10),
            new Circle(140, 40, 10),
            new Circle(60, 140, 10) };
    private final Line line1 = new Line();
    private final Line line2 = new Line();
    private final Line line3 = new Line();
    private final Text[] text = { new Text(), new Text(), new Text() };

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        setLines();
        pane.getChildren().addAll(circle[0], circle[1], circle[2],
                                  line1, line2, line3,
                                  text[0], text[1], text[2]);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("**Ex1520"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage 

        mouseDragEvent(0);
        mouseDragEvent(1);
        mouseDragEvent(2);
    }

    private void mouseDragEvent(int circleIndex) {
        circle[circleIndex].setOnMouseDragged(e -> {
            if (circle[circleIndex].contains(e.getX(), e.getY())) {
                // Recompute and display angles
                circle[circleIndex].setCenterX(e.getX());
                circle[circleIndex].setCenterY(e.getY());
                setLines();
            }
        });
    }

    private void setLines() {
        line1.setStartX(circle[0].getCenterX());
        line1.setStartY(circle[0].getCenterY());
        line1.setEndX(circle[1].getCenterX());
        line1.setEndY(circle[1].getCenterY());
        line2.setStartX(circle[0].getCenterX());
        line2.setStartY(circle[0].getCenterY());
        line2.setEndX(circle[2].getCenterX());
        line2.setEndY(circle[2].getCenterY());
        line3.setStartX(circle[1].getCenterX());
        line3.setStartY(circle[1].getCenterY());
        line3.setEndX(circle[2].getCenterX());
        line3.setEndY(circle[2].getCenterY());

        // Compute angles
        double a = new Point2D(circle[2].getCenterX(), circle[2].getCenterY()).distance(circle[1].getCenterX(), circle[1].getCenterY());
        double b = new Point2D(circle[2].getCenterX(), circle[2].getCenterY()).distance(circle[0].getCenterX(), circle[0].getCenterY());
        double c = new Point2D(circle[1].getCenterX(), circle[1].getCenterY()).distance(circle[0].getCenterX(), circle[0].getCenterY());
        double[] angle = new double[3];
        angle[0] = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        angle[1] = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        angle[2] = Math.acos((c * c - b * b - a * a) / (-2 * a * b));

        for (int i = 0; i < 3; i++) {
            text[i].setX(circle[i].getCenterX());
            double radius = 10;
            text[i].setY(circle[i].getCenterY() - radius);
            text[i].setText(String.format("%.2f", Math.toDegrees(angle[i])));
        }
    }
}
