package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * **15.31 (Geometry: pendulum) Write a program that animates a pendulum swinging,
 * as shown in Figure 15.37. Press the up arrow key to increase the speed, and the
 * down arrow key to decrease it. Press the S key to stop animation of and the R
 * key to resume it.
 *
 * @author Alex Golub
 * @since October 10, 2023 8:22 PM
 */
public class Ex1531 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        PendulumPane pendulumPane = new PendulumPane(400, 400);

        Scene scene = new Scene(pendulumPane);
        primaryStage.setTitle("**Ex1531");
        primaryStage.setScene(scene);
        pendulumPane.play();
        primaryStage.show();

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP -> pendulumPane.increase();
                case DOWN -> pendulumPane.decrease();
                default -> System.err.println(e.getCode() + " is not supported");
            }
        });
    }

    private static class PendulumPane extends Pane {

        PathTransition bPath;
        Circle topC;
        Circle lowerC;
        Line line;
        Arc arc;

        PendulumPane(double width, double height) {
            setPrefWidth(width);
            setPrefHeight(height);
            arc = new Arc(width / 2,
                          height * 0.8,
                          width * 0.15,
                          width * 0.15,
                          180,
                          180);
            arc.setFill(Color.TRANSPARENT);
            arc.setStroke(Color.BLACK);

            lowerC = new Circle(arc.getCenterX() - arc.getRadiusX(), arc.getCenterY(), 10);
            topC = new Circle(arc.getCenterX(), arc.getCenterY() - height / 3, lowerC.getRadius() / 3);
            arc = new Arc(topC.getCenterX(), topC.getCenterY(), width / 3, height / 3, 180, 180);
            line = new Line(
                    topC.getCenterX(), topC.getCenterY(),
                    lowerC.getCenterX(), lowerC.getCenterY()
            );

            line.endXProperty().bind(lowerC.translateXProperty().add(lowerC.getCenterX()));
            line.endYProperty().bind(lowerC.translateYProperty().add(lowerC.getCenterY()));

            bPath = new PathTransition();
            bPath.setDuration(Duration.millis(2000));
            bPath.setPath(arc);
            bPath.setNode(lowerC);
            bPath.setOrientation(PathTransition.OrientationType.NONE);
            bPath.setCycleCount(Animation.INDEFINITE);
            bPath.setAutoReverse(true);

            getChildren().addAll(lowerC, topC, line);
        }

        public void play() {
            bPath.play();
        }

        public void increase() {
            bPath.setRate(bPath.getCurrentRate() + 1);
        }

        public void decrease() {
            bPath.setRate(bPath.getCurrentRate() - 1);
        }
    }
}
