package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * *15.23 (Auto resize stop sign) Rewrite Programming Exercise 14.15 so the stop sign’s
 * width and height are automatically resized when the window is resized.
 *
 * @author Alex Golub
 * @since October 06, 2023 8:53 PM
 */
public class Ex1523 extends Application {

    private static final double WIDTH = 400;
    private static final double HEIGHT = 400;
    StackPane pane = new StackPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.RED);
        Text text = new Text("STOP");
        text.setFont(Font.font(100));
        text.setFill(Color.WHITE);

        pane.getChildren().addAll(polygon, text);

        ObservableList<Double> points = polygon.getPoints();

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        update(points);
        pane.widthProperty()
            .addListener(e -> {
                update(points);
                double radius = Math.min(pane.getWidth(), pane.getHeight()) * 0.25;
                text.setFont(Font.font(radius));
            });
        primaryStage.setTitle("*Ex1523");
        primaryStage.show();
    }

    private void update(ObservableList<Double> points) {
        double x = pane.getWidth() / 2;
        double y = pane.getHeight() / 2;
        double radius1 = Math.min(pane.getWidth(), pane.getHeight()) * 0.4;

        points.clear();
        for (int i = 0; i < 8; i++) {
            points.add(x + radius1 * Math.cos(Math.toRadians(i * 45 + 45.0 / 2)));
            points.add(y - radius1 * Math.sin(Math.toRadians(i * 45 + 45.0 / 2)));
        }
    }
}
