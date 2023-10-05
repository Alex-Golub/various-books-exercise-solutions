package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * **15.18 (Move a rectangle using mouse) Write a program that displays a rectangle.
 * You can point the mouse inside the rectangle and drag (i.e., move with mouse
 * pressed) the rectangle wherever the mouse goes. The mouse point becomes the
 * center of the rectangle.
 *
 * @author Alex Golub
 * @since October 06, 2023 4:16 PM
 */
public class Ex1518 extends Application {

    public static final double WIDTH = 400;
    public static final double HEIGHT = 400;
    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(WIDTH / 4, HEIGHT / 4, WIDTH / 4, HEIGHT / 4);
        rectangle.setFill(Color.LIGHTGREEN);

        rectangle.setOnMousePressed(this::onMousePressed);
        rectangle.setOnMouseDragged(this::onMouseDragged);

        Pane root = new Pane();
        root.getChildren().add(rectangle);

        primaryStage.setTitle("**Ex1518");
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }

    private void onMousePressed(MouseEvent event) {
        if (event.getSource() instanceof Rectangle rectangle) {
            xOffset = event.getSceneX() - rectangle.getX();
            yOffset = event.getSceneY() - rectangle.getY();
        }
    }

    private void onMouseDragged(MouseEvent event) {
        Rectangle rectangle = (Rectangle) event.getSource();
        double x = event.getSceneX() - xOffset;
        double y = event.getSceneY() - yOffset;

        if (x >= 0 &&
            x + rectangle.getWidth() <= rectangle.getParent().getBoundsInLocal().getWidth() &&
            y >= 0 &&
            y + rectangle.getHeight() <= rectangle.getParent().getBoundsInLocal().getHeight()) {
            rectangle.setX(x);
            rectangle.setY(y);
        }
    }
}
