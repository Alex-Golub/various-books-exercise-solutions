package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 14.14 (Display a rectanguloid) Write a program that displays a rectanguloid, as
 * shown in Figure 14.47a. The cube should grow and shrink as the window grows
 * or shrinks.
 * 
 * @author Alex Golub
 * @since July 21, 2023 10:24 PM
 */
public class Ex1414 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new MyCubePane();

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyCubePane extends Pane {
    
    private void paint() {
        double paneWidth = getWidth();
        double paneHeight = getHeight();
        double width = paneWidth * 0.90 - 30;
        double height = paneHeight * 0.80 - 30;
        double diff = Math.min(50, Math.min(width, height) * 0.4);

        // Draw the front rectangle
        Rectangle r1 = new Rectangle(10, 60, width, height);
        r1.setFill(new Color(1, 1, 1, 0));
        r1.setStroke(Color.BLACK);

        // Draw the back rectangle
        Rectangle r2 = new Rectangle(30, 60 - diff, width, height);
        r2.setFill(new Color(1, 1, 1, 0));
        r2.setStroke(Color.BLACK);

        // Connect the corners
        Line line1 = new Line(10, 60, 30, 60 - diff);
        Line line2 = new Line(10, 60 + height, 30, 60 - diff + height);
        Line line3 = new Line(10 + width, 60, 30 + width, 60 - diff);
        Line line4 = new Line(10 + width, 60 + height, 30 + width, 60 - diff + height);

        getChildren().clear();
        getChildren().addAll(r1, r2, line1, line2, line3, line4);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}
