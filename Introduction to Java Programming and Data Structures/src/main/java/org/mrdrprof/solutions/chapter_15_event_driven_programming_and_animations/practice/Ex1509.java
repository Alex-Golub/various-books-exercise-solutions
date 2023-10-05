package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * *15.9 (Draw lines using the arrow keys) Write a program that draws line segments
 * using the arrow keys. The line starts from (100, 100) in the pane and draws
 * toward east, north, west, or south when the right-arrow key, up-arrow key,
 * left-arrow key, or down-arrow key is pressed, as shown in Figure 15.28b.
 *
 * @author Alex Golub
 * @since October 03, 2023 8:49 PM
 */
public class Ex1509 extends Application {

    static final double WIDTH = 400;
    static final double HEIGHT = 400;
    public static final int STEP = 20;
    public static final int STROKE_WIDTH = 3;

    Pane pane = new Pane();
    double cX = WIDTH / 2;
    double cY = HEIGHT / 2;

    @Override
    public void start(Stage primaryStage) {
        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP -> moveUp();
                case DOWN -> moveDown();
                case LEFT -> moveLeft();
                case RIGHT -> moveRight();
                default -> System.out.println(e.getCode() + " key is no supported");
            }
        });

        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
        primaryStage.setTitle("Ex1509");
        primaryStage.show();

        pane.requestFocus();
    }

    private void moveUp() {
        if (cY - STEP < 0) {
            return;
        }

        Line line = new Line(cX, cY, cX, cY - STEP);
        line.setStrokeWidth(STROKE_WIDTH);
        pane.getChildren().add(line);
        cY -= STEP;
    }

    private void moveDown() {
        if (cY + STEP > HEIGHT) {
            return;
        }

        Line line = new Line(cX, cY, cX, cY + STEP);
        line.setStrokeWidth(STROKE_WIDTH);
        pane.getChildren().add(line);
        cY += STEP;
    }

    private void moveLeft() {
        if (cX - STEP < 0) {
            return;
        }

        Line line = new Line(cX, cY, cX - STEP, cY);
        line.setStrokeWidth(STROKE_WIDTH);
        pane.getChildren().add(line);
        cX -= STEP;
    }

    private void moveRight() {
        if (cX + STEP > WIDTH) {
            return;
        }

        Line line = new Line(cX, cY, cX + STEP, cY);
        line.setStrokeWidth(STROKE_WIDTH);
        pane.getChildren().add(line);
        cX += STEP;
    }
}
