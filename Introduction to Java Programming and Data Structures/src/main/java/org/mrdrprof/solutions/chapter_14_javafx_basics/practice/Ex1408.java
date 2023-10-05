package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import org.mrdrprof.solutions.utils.chapter_14.ImageLocationUtils;

/**
 * 14.8 (Display 54 cards) Expand Exercise 14.3 to display all 54 cards (including two
 * jokers), nine per row. The image files are jokers and are named 53.png and 54.png.
 *
 * @author Alex Golub
 * @since July 21, 2023 5:44 PM
 */
public class Ex1408 extends Application {

    private static final int CARDS_PER_ROW = 13;
    private static final int NUMBER_OF_CARDS = 54;

    @Override
    public void start(Stage primaryStage) throws Exception {
        String cardsDirectory = ImageLocationUtils.getCardsDirectory();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        // Set column constraints to make the grid responsive
        for (int i = 0; i < CARDS_PER_ROW; i++) {
            ColumnConstraints colConstraints = new ColumnConstraints();
            colConstraints.setPercentWidth(100.0 / CARDS_PER_ROW);
            gridPane.getColumnConstraints().add(colConstraints);
        }

        // Calculate the number of rows needed to display all cards
        int numRows = (NUMBER_OF_CARDS + CARDS_PER_ROW - 1) / CARDS_PER_ROW;

        // Set row constraints to make the grid responsive
        for (int i = 0; i < numRows; i++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100.0 / numRows);
            gridPane.getRowConstraints().add(rowConstraints);
        }
        
        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            int rowIndex = i / CARDS_PER_ROW;
            int columnIndex = i % CARDS_PER_ROW;

            ImageView cardImage = new ImageView("%s/%d.png".formatted(cardsDirectory, (i + 1)));
            cardImage.setPreserveRatio(true);
            gridPane.add(cardImage, columnIndex, rowIndex);
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.show();
    }
}
