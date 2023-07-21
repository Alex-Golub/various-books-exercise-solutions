package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * **14.13 (Display a pie chart) Write a program that uses a pie chart to display the percentages of the overall grade represented by projects, quizzes, midterm exams,
 * and the final exam, as shown in Figure 14.46c. Suppose projects take 20% and
 * are displayed in red, quizzes take 10% and are displayed in blue, midterm exams
 * take 30% and are displayed in green, and the final exam takes 40% and is displayed in orange. Use the Arc class to display the pies. Interested readers may
 * explore the JavaFX PieChart class for further study.
 * 
 * @author Alex Golub
 * @since July 21, 2023 10:17 PM
 */
public class Ex1413 extends Application {

    private static final double RADIUS = 100;
    private static final double CENTER_X = 200;
    private static final double CENTER_Y = 200;

    private static final double[] percent = { 0.20, 0.10, 0.30, 0.40 };
    private static final String[] titles = {
            "project -- " + String.format("%d%s", (int) (100 * percent[0]), "%"),
            "quizzes -- " + String.format("%d%s", (int) (100 * percent[1]), "%"),
            "midterm -- " + String.format("%d%s", (int) (100 * percent[2]), "%"),
            "final -- " + String.format("%d%s", (int) (100 * percent[3]), "%")
    };
    private static final Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE };

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        drawPieChart(pane);
        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.show();
    }

    private void drawPieChart(Pane pane) {
        List<Shape> shapes = new ArrayList<>();

        Circle c = new Circle(CENTER_X,
                              CENTER_Y,
                              RADIUS,
                              Color.TRANSPARENT);
        c.setStroke(Color.BLACK);
        shapes.add(c);

        double angle = 0;
        for (int i = 0; i < titles.length; i++) {
            double length = percent[i] * 100 * 3.6;
            Arc arc = new Arc(CENTER_X, CENTER_Y, RADIUS, RADIUS, angle, length);
            arc.setFill(colors[i]);
            arc.setType(ArcType.ROUND);
            shapes.add(arc);
            angle += length;
        }

        drawLabels(shapes);
        pane.getChildren().addAll(shapes);
    }

    private void drawLabels(List<Shape> shapes) {
        double angle = 0;
        for (int i = 0; i < titles.length; i++) {
            double length = percent[i] * 100 * 3.6;
            double radians = Math.toRadians(angle * -1 - (length / 2));
            double x = CENTER_X + RADIUS * Math.cos(radians);
            double y = CENTER_Y + RADIUS * Math.sin(radians);
            if (y > CENTER_Y) {
                y -= RADIUS / 2;
                x -= RADIUS / 2;
            }
            Text text = new Text(x, y, titles[i]);
            shapes.add(text);
            angle += length;
        }
    }
}
