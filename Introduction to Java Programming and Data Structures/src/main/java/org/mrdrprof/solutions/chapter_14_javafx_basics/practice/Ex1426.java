package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.mrdrprof.solutions.chapter_14_javafx_basics.theory.ClockPane;

/**
 * @author Alex Golub
 * @since July 22, 2023 12:14 PM
 */
public class Ex1426 extends Application {

    private final int WIDTH = 250;
    private final int HEIGHT = 250;

    @Override
    public void start(Stage primaryStage) {
        double paneWidth = 200;
        double paneHeight = 200;

        ClockPane clock1 = new ClockPane(4, 20, 45);
        ClockPane clock2 = new ClockPane(22, 46, 15);

        GridPane pane = new GridPane();
        pane.add(clock1, 0, 0);
        pane.add(clock2, 1, 0);

        clock1.setWidth(WIDTH);
        clock1.setHeight(HEIGHT);
        clock2.setWidth(WIDTH);
        clock2.setHeight(HEIGHT);
        
        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
