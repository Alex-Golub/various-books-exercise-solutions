package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

/**
 * *15.3 (Move the ball) Write a program that moves the ball in a pane. You should
 * define a pane class for displaying the ball and provide the methods for moving
 * the ball left, right, up, and down, as shown in Figure 15.26c. Check the boundary to prevent the ball from moving out of sight completely.
 *
 * @author Alex Golub
 * @since October 01, 2023 1:28 PM
 */
public class Ex1503 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        double width = 400;
        double height = 400;
        BallPane ballPane = new BallPane(width / 2,
                                         height / 2,
                                         width / 15);

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(getButtons(ballPane));

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click to move ball");
        primaryStage.show();
    }

    @NotNull
    private static HBox getButtons(BallPane ballPane) {
        Button btUp = new Button("Up");
        btUp.setOnAction(e -> ballPane.moveUp());

        Button btDown = new Button("Down");
        btDown.setOnAction(e -> ballPane.moveDown());

        Button btLeft = new Button("Left");
        btLeft.setOnAction(e -> ballPane.moveLeft());

        Button btRight = new Button("Right");
        btRight.setOnAction(e -> ballPane.moveRight());

        ballPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                ballPane.moveUp();
            } else if (e.getCode() == KeyCode.DOWN) {
                ballPane.moveDown();
            } else if (e.getCode() == KeyCode.LEFT) {
                ballPane.moveLeft();
            } else if (e.getCode() == KeyCode.RIGHT) {
                ballPane.moveRight();
            }
        });

        HBox buttons = new HBox(btUp, btDown, btLeft, btRight);
        buttons.setAlignment(Pos.BOTTOM_CENTER);
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(10, 10, 10, 10));

        return buttons;
    }

    // Made public for Ex1511
    public static class BallPane extends Pane {

        private final Circle mCircle;

        BallPane(double centerX, double centerY, double radius) {
            mCircle = new Circle(centerX, centerY, radius);
            getChildren().add(mCircle);
            setFocusTraversable(true); // Set the BallPane to be focus traversable
        }

        void moveUp() {
            if (mCircle.getCenterY() - mCircle.getRadius() - 10 >= 0) {
                mCircle.setCenterY(mCircle.getCenterY() - 10);
            }
        }

        void moveDown() {
            if (mCircle.getCenterY() + mCircle.getRadius() + 10 <= getHeight()) {
                mCircle.setCenterY(mCircle.getCenterY() + 10);
            }
        }

        void moveRight() {
            if (mCircle.getCenterX() + mCircle.getRadius() + 10 <= getWidth()) {
                mCircle.setCenterX(mCircle.getCenterX() + 10);
            }
        }

        void moveLeft() {
            if (mCircle.getCenterX() - mCircle.getRadius() - 10 >= 0) {
                mCircle.setCenterX(mCircle.getCenterX() - 10);
            }
        }
    }
}
