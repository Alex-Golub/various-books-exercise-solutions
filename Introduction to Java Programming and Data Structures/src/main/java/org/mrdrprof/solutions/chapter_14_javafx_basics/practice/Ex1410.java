package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * *14.10 (Display a cylinder) Write a program that draws a cylinder, as shown in Figure 14.45c.
 * You can use the following method to set the dashed stroke for an arc:
 * arc.getStrokeDashArray().addAll(6.0, 21.0);
 * The solution posted on the website enables the cylinder to resize horizontally.
 * Can you revise it to resize vertically as well?
 *
 * @author Alex Golub
 * @since July 21, 2023 9:31 PM
 */
public class Ex1410 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new MyCylinder(), 200, 200);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyCylinder extends Pane {

    private double centerX;
    private double radiusX;
    private double height;

    public MyCylinder() {
        widthProperty().addListener((observableValue, oldWidth, newWidth) -> {
            centerX = newWidth.doubleValue() / 2;
            radiusX = newWidth.doubleValue() * 0.8 / 2;
            paint();
        });

        heightProperty().addListener((observableValue, oldHeight, newHeight) -> {
            height = newHeight.doubleValue();
            paint();
        });
    }

    public void paint() {
        double centerY = height / 2;

        Ellipse ellipse = new Ellipse(centerX, 40, radiusX, 20);
        ellipse.setFill(Color.WHITE);
        ellipse.setStroke(Color.BLACK);

        Arc arc1 = new Arc(centerX, centerY, radiusX, 20, 0, 180);
        arc1.setFill(Color.WHITE);
        arc1.setStroke(Color.BLACK);
        arc1.getStrokeDashArray().addAll(6.0, 21.0);

        Arc arc2 = new Arc(centerX, centerY, radiusX, 20, 180, 180);
        arc2.setFill(Color.WHITE);
        arc2.setStroke(Color.BLACK);

        getChildren().clear();
        getChildren().addAll(ellipse, arc1, arc2,
                             new Line(centerX - radiusX, 40, centerX - radiusX, centerY),
                             new Line(centerX + radiusX, 40, centerX + radiusX, centerY));
    }
}
