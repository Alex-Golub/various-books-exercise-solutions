package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class CheckPointTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        double[] points = { 20, 40, 30, 50, 40, 90, 90, 10, 10, 30 };
        Polyline polyline = new Polyline(points);
        polyline.setFill(Color.GREEN);

        StackPane stackPane = new StackPane(polyline);
        stackPane.setPadding(new Insets(100));
        stackPane.setStyle("-fx-background-color: lightgrey");

        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkpoint 14.11.10");
        primaryStage.show();
    }
}
