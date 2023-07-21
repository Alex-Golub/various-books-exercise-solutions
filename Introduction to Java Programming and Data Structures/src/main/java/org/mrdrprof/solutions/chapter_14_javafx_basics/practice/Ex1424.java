package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * *14.24 (Geometry: Inside a polygon?) Write a program that prompts the user to enter
 * the coordinates of five points from the command line. The first four points form a
 * polygon, and the program displays the polygon and a text that indicates whether
 * the fifth point is inside the polygon, as shown in Figure 14.51a. (Hint: Use the
 * Node’s contains method to test whether a point is inside a node.)
 *
 * @author Alex Golub
 * @since July 22, 2023 12:02 PM
 */
public class Ex1424 extends Application {
    
    private static final double PANE_WIDTH = 400;
    private static final double PANE_HEIGHT = 400;
    private static final double CIRCLE_RADIUS = 5;

    @Override
    public void start(Stage primaryStage) {
        double[] points = getPointsFromUser();

        Polygon polygon = createPolygon(points);
        double testX = points[8];
        double testY = points[9];

        Pane pane = new Pane();
        pane.setPrefSize(PANE_WIDTH, PANE_HEIGHT);

        Text resultText = new Text(10, PANE_HEIGHT - 20, "");
        if (polygon.contains(testX, testY)) {
            resultText.setText("The point is inside the polygon");
        } else {
            resultText.setText("The point is not inside the polygon");
        }

        Circle testCircle = new Circle(testX, testY, CIRCLE_RADIUS);
        testCircle.setFill(Color.RED);

        pane.getChildren().addAll(polygon, testCircle, resultText);

        Scene scene = new Scene(pane);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double[] getPointsFromUser() {
        System.out.print("Enter five points: ");
        Scanner input = new Scanner(System.in);
        double[] points = new double[10];
        for (int i = 0; i < 10; i++) {
            points[i] = input.nextDouble();
        }
        return points;
    }

    private Polygon createPolygon(double[] points) {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();
        for (int i = 0; i < 8; i += 2) {
            list.add(points[i]);
            list.add(points[i + 1]);
        }
        return polygon;
    }
} 
