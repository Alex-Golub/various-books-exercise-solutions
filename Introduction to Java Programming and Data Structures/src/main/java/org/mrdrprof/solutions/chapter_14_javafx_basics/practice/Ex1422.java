package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

/**
 * *14.22 (Connect two circles) Write a program that draws two filled circles with radius
 * 15 pixels, centered at random locations, with a line connecting the two circles.
 * The line should not cross inside the circles, as shown in Figure 14.49c.
 *
 * @author Alex Golub
 * @since July 22, 2023 11:40 AM
 */
public class Ex1422 extends Application {
    
    private static final double PANE_WIDTH = 250;
    private static final double PANE_HEIGHT = 250;
    private static final double CIRCLE_RADIUS = 25;
    private static final Random RANDOM = new Random();

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Generate random center points for the two circles
        double[] center1 = getRandomPoint(CIRCLE_RADIUS, PANE_WIDTH, PANE_HEIGHT);
        double[] center2 = getRandomPoint(CIRCLE_RADIUS, PANE_WIDTH, PANE_HEIGHT);

        Circle circle1 = new Circle(center1[0], center1[1], CIRCLE_RADIUS, Color.WHITE);
        Circle circle2 = new Circle(center2[0], center2[1], CIRCLE_RADIUS, Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle2.setStroke(Color.BLACK);

        Text text1 = new Text(center1[0], center1[1], "1");
        Text text2 = new Text(center2[0], center2[1], "2");

        Line line = connectTwoCircles(center1[0], center1[1], center2[0], center2[1], CIRCLE_RADIUS);

        pane.getChildren().addAll(circle1, circle2, line, text1, text2);

        Scene scene = new Scene(pane, PANE_WIDTH, PANE_HEIGHT);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double[] getRandomPoint(double radius, double paneWidth, double paneHeight) {
        double x = RANDOM.nextDouble() * (paneWidth - 2 * radius) + radius;
        double y = RANDOM.nextDouble() * (paneHeight - 2 * radius) + radius;
        
        return new double[] { x, y };
    }

    private Line connectTwoCircles(double x1, double y1, double x2, double y2, double radius) {
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        double x11 = x1 - radius * (x1 - x2) / distance;
        double y11 = y1 - radius * (y1 - y2) / distance;
        double x21 = x2 + radius * (x1 - x2) / distance;
        double y21 = y2 + radius * (y1 - y2) / distance;
        
        return new Line(x11, y11, x21, y21);
    }
} 
