package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * *14.9 (Create four fans) Write a program that places four fans in a GridPane with two
 * rows and two columns, as shown in Figure 14.45b.
 *
 * @author Alex Golub
 * @since July 21, 2023 6:00 PM
 */
public class Ex1409 extends Application {

    private static final int RADIUS = 100;
    private static final int GAP = 10;
    private static final int TOTAL_NUMBER_OF_FANS = 4;
    private static final int FANS_PER_ROW = 2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);
        gridPane.setHgap(GAP);
        gridPane.setVgap(GAP);
        gridPane.setPadding(new Insets(GAP));

        // Create four fans and add them to the gridPane
        for (int i = 0; i < TOTAL_NUMBER_OF_FANS; i++) {
            int row = i / FANS_PER_ROW;
            int colum = i % FANS_PER_ROW;

            Pane fanPane = createFan();
            gridPane.add(fanPane, colum, row);
        }

        Scene scene = new Scene(gridPane, 425, 425);
        primaryStage.setScene(scene);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.show();
    }

    private Pane createFan() {
        Pane fanPane = new Pane();
        int centerX = RADIUS;
        int centerY = RADIUS;

        // create circle
        Circle c = new Circle(centerX, centerY, RADIUS, Color.WHITE);
        c.setStroke(Color.BLACK);
        fanPane.getChildren().add(c);

        // create 4 arcs with 90 degree increment
        for (int k = 30; k < 360; k += 90) {
            Arc arc = new Arc(centerX, centerY, RADIUS - 15.0, RADIUS - 15.0, k, 30);
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
            
            fanPane.getChildren().add(arc);
        }

        return fanPane;
    }
}
