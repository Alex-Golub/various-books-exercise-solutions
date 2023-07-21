package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * *14.6 (Game: display a checkerboard) Write a program that displays a checkerboard
 * in which each white and black cell is a Rectangle with a fill color black or
 * white, as shown in Figure 14.44c.
 *
 * @author Alex Golub
 * @since July 21, 2023 3:40 PM
 */
public class Ex1406 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();

        for (int i = 0; i < 8 * 8; i++) {
            int row = i / 8;
            int col = i % 8;

            Color color = (row + col) % 2 == 0 ? Color.WHITE : Color.BLACK;
            Rectangle rectangle = new Rectangle(50, 50, color);
            
            gridPane.add(rectangle, col, row);
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.show();
    }
}
