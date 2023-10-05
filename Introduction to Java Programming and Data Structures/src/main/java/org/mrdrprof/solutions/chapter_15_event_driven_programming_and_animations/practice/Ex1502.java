package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 15.2 (Rotate a rectangle) Write a program that rotates a rectangle 15 degrees to the
 * right when the Rotate button is clicked, as shown in Figure 15.26b.
 *
 * @author Alex Golub
 * @since September 30, 2023 5:24 PM
 */
public class Ex1502 extends Application {

    private static final int MIN_WIDTH = 300;
    private static final int MIN_HEIGHT = 300;
    private static final int ROTATION_SPEED = 25;
    private static final int ROTATE_BY_DEGREES = 1;
    private boolean isRotating = false;

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.setMinWidth(MIN_WIDTH);
        stackPane.setMinHeight(MIN_HEIGHT);

        Rectangle rectangle = new Rectangle();
        rectangle.widthProperty().bind(primaryStage.widthProperty().divide(2));
        rectangle.heightProperty().bind(primaryStage.heightProperty().divide(2));

        Button rotateBtn = new Button("Rotate");

        rotateBtn.setOnAction(e -> {
            if (!isRotating) {
                isRotating = true;
                startRotation(rectangle);
            } else {
                isRotating = false;
            }
        });

        StackPane.setAlignment(rectangle, Pos.CENTER);
        StackPane.setAlignment(rotateBtn, Pos.BOTTOM_CENTER);

        stackPane.getChildren().add(rotateBtn);
        stackPane.getChildren().add(rectangle);

        Scene scene = new Scene(stackPane, MIN_WIDTH, MIN_HEIGHT);

        scene.setOnMousePressed(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                isRotating = true;
                startRotation(rectangle);
            }
        });

        scene.setOnMouseReleased(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                isRotating = false;
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_02");
        primaryStage.show();
    }

    private void startRotation(Rectangle rectangle) {
        Thread rotationThread = new Thread(() -> {
            while (isRotating) {
                try {
                    Thread.sleep(ROTATION_SPEED); // Adjust rotation speed here
                    rectangle.setRotate(rectangle.getRotate() + ROTATE_BY_DEGREES);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        rotationThread.start();
    }
}
