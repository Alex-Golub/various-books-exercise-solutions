package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * *14.23 (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center coordinates, width, and height of two rectangles from the command line.
 * The program displays the rectangles and a text indicating whether the two are
 * overlapping, whether one is contained in the other, or whether they don’t overlap, as shown in Figure 14.50. See Programming Exercise 10.13 for checking the
 * relationship between two rectangles.
 *
 * @author Alex Golub
 * @since July 22, 2023 11:49 AM
 */
public class Ex1423 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the center coordinates, width, and height of the first rectangle:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();

        System.out.println("Enter the center coordinates, width, and height of the second rectangle:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();

        Pane pane = new Pane();

        Rectangle rectangle1 = drawRectangle(x1, y1, width1, height1);
        Rectangle rectangle2 = drawRectangle(x2, y2, width2, height2);
        pane.getChildren().addAll(rectangle1, rectangle2);

        Rectangle2D rect1 = new Rectangle2D(x1 - width1 / 2, y1 - height1 / 2, width1, height1);
        Rectangle2D rect2 = new Rectangle2D(x2 - width2 / 2, y2 - height2 / 2, width2, height2);

        Text resultText = checkRelationship(rect1, rect2);
        pane.getChildren().add(resultText);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Two Rectangles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Rectangle drawRectangle(double x, double y, double width, double height) {
        Rectangle rectangle = new Rectangle(x - width / 2, y - height / 2, width, height);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);
        return rectangle;
    }

    private Text checkRelationship(Rectangle2D rect1, Rectangle2D rect2) {
        double minX = Math.max(rect1.getMinX(), rect2.getMinX());
        double minY = Math.max(rect1.getMinY(), rect2.getMinY());
        double maxX = Math.min(rect1.getMaxX(), rect2.getMaxX());
        double maxY = Math.min(rect1.getMaxY(), rect2.getMaxY());

        if (maxX >= minX && maxY >= minY) {
            Rectangle2D intersection = new Rectangle2D(minX, minY, maxX - minX, maxY - minY);
            return new Text(150, 280, "The rectangles overlap.\n" +
                                      "Intersection: Width = " + intersection.getWidth() + ", Height = " + intersection.getHeight());
        } else {
            return new Text(150, 280, "The rectangles don't overlap.");
        }
    }
} 
