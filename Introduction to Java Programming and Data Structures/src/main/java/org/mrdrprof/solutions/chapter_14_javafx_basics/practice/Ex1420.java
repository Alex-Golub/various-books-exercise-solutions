package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * **14.20 (Draw an arrow line) Write a static method that draws an arrow line from a
 * starting point to an ending point in a pane using the following method header:
 * public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane)
 * Write a test program that randomly draws an arrow line, as shown in Figure 14.49a.
 *
 * @author Alex Golub
 * @since July 22, 2023 11:24 AM
 */
public class Ex1420 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        double paneWidth = 300;
        double paneHeight = 250;
        double x1 = Math.random() * (paneWidth - 12);
        double y1 = Math.random() * (paneHeight - 12);
        double x2 = Math.random() * (paneWidth - 12);
        double y2 = Math.random() * (paneHeight - 12);

        drawArrowLine(x1, y1, x2, y2, pane);

        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
        Line line = new Line(startX, startY, endX, endY);
        line.setStrokeWidth(2);
        pane.getChildren().add(line);

        // Calculate arrow angle
        double arrowAngle = Math.atan2(endY - startY, endX - startX);

        // Set arrow length
        double arrowLength = 15;

        // Draw the arrowhead lines
        Line arrowLine1 = new Line(endX,
                                   endY,
                                   endX + Math.cos(arrowAngle + Math.toRadians(150)) * arrowLength,
                                   endY + Math.sin(arrowAngle + Math.toRadians(150)) * arrowLength);
        Line arrowLine2 = new Line(endX,
                                   endY,
                                   endX + Math.cos(arrowAngle - Math.toRadians(150)) * arrowLength,
                                   endY + Math.sin(arrowAngle - Math.toRadians(150)) * arrowLength);

        pane.getChildren().addAll(arrowLine1, arrowLine2);
    }
} 
