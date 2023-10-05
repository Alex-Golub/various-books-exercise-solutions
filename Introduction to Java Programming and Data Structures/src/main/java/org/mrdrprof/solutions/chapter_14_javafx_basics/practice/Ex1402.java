package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.mrdrprof.solutions.utils.chapter_14.ImageLocationUtils;

/**
 * *14.2 (Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as
 * shown in Figure 14.43b. A cell may be X, O, or empty. What to display
 * at each cell is randomly decided. The X and O are the image files x.gif
 * and o.gif.
 *
 * @author Alex Golub
 * @since July 19, 2023 7:16 PM
 */
public class Ex1402 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String xUrl = ImageLocationUtils.getImageDirectory() + "/x.gif";
        String oUrl = ImageLocationUtils.getImageDirectory() + "/o.gif";

        GridPane board = new GridPane();
        board.setHgap(10);
        board.setVgap(10);
        board.setGridLinesVisible(true);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board.add(new ImageView(Math.random() < 0.5 ? xUrl : oUrl), col, row);
            }
        }

        Scene scene = new Scene(board);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex1402");
        primaryStage.show();
    }
}
