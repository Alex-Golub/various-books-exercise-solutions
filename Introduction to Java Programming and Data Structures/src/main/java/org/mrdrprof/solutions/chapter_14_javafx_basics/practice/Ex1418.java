package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * *14.18 (Plot the square function) Write a program that draws a diagram for the function
 * f(x) = x2 (see Figure 14.48b).
 * Hint: Add points to a polyline using the following code:
 * <p>
 * Polyline polyline = new Polyline();
 * ObservableList<Double> list = polyline.getPoints();
 * double scaleFactor = 0.0125;
 * for (int x = –100; x <= 100; x++) {
 * list.add(x + 200.0);
 * list.add(scaleFactor * x * x);
 * }
 *
 * @author Alex Golub
 * @since July 21, 2023 10:54 PM
 */
public class Ex1418 extends Application {
    
    private static final int MIN_X = -100;
    private static final int MAX_X = 100;
    private static final double SCALE_FACTOR = 0.0125;
    private static final int CENTER_X = 200;
    private static final int CENTER_Y = 200;

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();

        Polyline polyline = createSquareFunctionPlot();
        group.getChildren().add(polyline);

        // Create and add the x and y axes
        Line xAxis = createAxis(CENTER_X - 190, CENTER_Y, CENTER_X + 190, CENTER_Y);
        Line yAxis = createAxis(CENTER_X, CENTER_Y - 170, CENTER_X, CENTER_Y + 170);
        group.getChildren().addAll(xAxis, yAxis);

        // Create and add the arrows for the axes
        Line xAxisArrow1 = createArrow(CENTER_X + 190, CENTER_Y, CENTER_X + 170, CENTER_Y - 10);
        Line xAxisArrow2 = createArrow(CENTER_X + 190, CENTER_Y, CENTER_X + 170, CENTER_Y + 10);
        Line yAxisArrow1 = createArrow(CENTER_X, CENTER_Y - 170, CENTER_X - 10, CENTER_Y - 150);
        Line yAxisArrow2 = createArrow(CENTER_X, CENTER_Y - 170, CENTER_X + 10, CENTER_Y - 150);
        group.getChildren().addAll(xAxisArrow1, xAxisArrow2, yAxisArrow1, yAxisArrow2);

        // Add x and y axis labels
        Text xLabel = new Text(CENTER_X + 180, CENTER_Y + 20, "X");
        Text yLabel = new Text(CENTER_X - 20, CENTER_Y - 160, "Y");
        group.getChildren().addAll(xLabel, yLabel);

        Scene scene = new Scene(new BorderPane(group), 400, 400);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Polyline createSquareFunctionPlot() {
        Polyline polyline = new Polyline();
        ObservableList<Double> points = polyline.getPoints();

        for (int x = MIN_X; x <= MAX_X; x++) {
            double scaledX = CENTER_X + x;
            double scaledY = CENTER_Y - SCALE_FACTOR * x * x;
            points.add(scaledX);
            points.add(scaledY);
        }

        polyline.setStroke(Color.BLUE);
        return polyline;
    }

    private Line createAxis(double startX, double startY, double endX, double endY) {
        Line axis = new Line(startX, startY, endX, endY);
        axis.setStroke(Color.BLACK);
        return axis;
    }

    private Line createArrow(double startX, double startY, double endX, double endY) {
        Line arrow = new Line(startX, startY, endX, endY);
        arrow.setStroke(Color.BLACK);
        return arrow;
    }
}
