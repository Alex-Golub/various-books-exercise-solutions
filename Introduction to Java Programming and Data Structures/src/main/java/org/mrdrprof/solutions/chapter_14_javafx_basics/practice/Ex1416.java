package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * *14.16 (Display a 3 * 3 grid) Write a program that displays a 3 * 3 grid, as shown in
 * Figure 14.47c. Use red color for vertical lines and blue for horizontals. The lines
 * are automatically resized when the window is resized.
 *
 * @author Alex Golub
 * @since July 21, 2023 10:33 PM
 */
public class Ex1416 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Grid3x3 grid = new Grid3x3();

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class Grid3x3 extends Pane {
    
    public Grid3x3() {
        drawGrid();
        widthProperty().addListener((observable, oldValue, newValue) -> drawGrid());
        heightProperty().addListener((observable, oldValue, newValue) -> drawGrid());
    }

    private void drawGrid() {
        // Clear existing lines
        getChildren().clear();
        
        double width = getWidth();
        double height = getHeight();
        double cellWidth = width / 3;
        double cellHeight = height / 3;

        // Draw vertical lines
        for (int i = 1; i < 3; i++) {
            Line line = new Line(cellWidth * i, 0, cellWidth * i, height);
            line.setStroke(Color.RED);
            getChildren().add(line);
        }

        // Draw horizontal lines
        for (int i = 1; i < 3; i++) {
            Line line = new Line(0, cellHeight * i, width, cellHeight * i);
            line.setStroke(Color.BLUE);
            getChildren().add(line);
        }
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        drawGrid();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        drawGrid();
    }
}
