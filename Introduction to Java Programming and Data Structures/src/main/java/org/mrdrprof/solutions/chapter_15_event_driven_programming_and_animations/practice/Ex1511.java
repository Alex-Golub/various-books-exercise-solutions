package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * *15.11 (Move a circle using keys) Write a program that moves a circle up, down, left,
 * or right using the arrow keys.
 *
 * @author Alex Golub
 * @since October 05, 2023 7:52 PM
 */
public class Ex1511 extends Application {

    static final double WIDTH = 400;
    static final double HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Ex1503.BallPane circle = new Ex1503.BallPane(WIDTH / 2, HEIGHT / 2, HEIGHT / 8);
        StackPane stackPane = new StackPane(circle);

        stackPane.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()) {
                case UP -> circle.moveUp();
                case DOWN -> circle.moveDown();
                case LEFT -> circle.moveLeft();
                case RIGHT -> circle.moveRight();

                default -> System.err.println(keyEvent.getCode() + " key is not supported");
            }
        });

        primaryStage.setScene(new Scene(stackPane, WIDTH, HEIGHT));
        primaryStage.setTitle("*Ex1511");
        primaryStage.show();
        stackPane.requestFocus();
    }
}
