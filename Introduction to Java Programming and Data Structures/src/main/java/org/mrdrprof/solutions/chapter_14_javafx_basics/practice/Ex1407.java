package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.util.Random;

/**
 * *14.7 (Display random 0 or 1) Write a program that displays a 10-by-10 square matrix,
 * as shown in Figure 14.45a. Each element in the matrix is 0 or 1, randomly generated.
 * Display each number centered in a text field. Use TextField’s setText
 * method to set value 0 or 1 as a string.
 *
 * @author Alex Golub
 * @since July 21, 2023 5:25 PM
 */
public class Ex1407 extends Application {

    private static final int ROWS = 10;
    private static final int COLUMNS = 10;
    private static final Random RANDOM = new Random();

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(0);
        gridPane.setVgap(0);
        
        for (int i = 0; i < ROWS * COLUMNS; i++) {
            int row = i / ROWS;
            int col = i % COLUMNS;

            TextField textField = new TextField(String.valueOf(RANDOM.nextInt(2)));
            textField.setAlignment(Pos.CENTER);
            textField.setEditable(false);

            gridPane.add(textField, col, row);
        }

        // Set constraints to make the grid responsive
        for (int i = 0; i < 10; i++) {
            ColumnConstraints colConstraints = new ColumnConstraints();
            colConstraints.setPercentWidth(100.0 / 10); // Each column takes 10% of the width
            gridPane.getColumnConstraints().add(colConstraints);

            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100.0 / 10); // Each row takes 10% of the height
            gridPane.getRowConstraints().add(rowConstraints);
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.show();
    }
}
