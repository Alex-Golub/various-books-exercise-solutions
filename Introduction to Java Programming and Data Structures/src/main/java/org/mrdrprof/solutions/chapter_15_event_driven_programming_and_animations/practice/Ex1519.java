package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

/**
 * **15.19 (Game: eye–hand coordination) Write a program that displays a circle of
 * radius 10 pixels filled with a random color at a random location on a pane, as
 * shown in Figure 15.31b. When you click the circle, it disappears and a new
 * random-color circle is displayed at another random location. After 20 circles
 * are clicked, display the time spent in the pane, as shown in Figure 15.31c.
 * 
 * @author Alex Golub
 * @since October 06, 2023 4:39 PM
 */
public class Ex1519 extends Application {

    public static final Random RANDOM = new Random();
    private static final int CIRCLE_RADIUS = 10;
    private static final int MAX_CIRCLES = 10;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    private int circleCount = 0;
    private long startTime;
    private Label timeLabel;
    private Timeline timeline;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, WIDTH, HEIGHT);

        timeLabel = new Label("Time: 0 seconds");
        timeLabel.setLayoutX(10);
        timeLabel.setLayoutY(10);

        timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> updateTime())
        );
        timeline.setCycleCount(Animation.INDEFINITE);

        pane.getChildren().add(timeLabel);

        scene.setOnMouseClicked(this::handleMouseClick);

        primaryStage.setTitle("**Ex1519");
        primaryStage.setScene(scene);
        primaryStage.show();

        startNewGame();
    }

    private void updateTime() {
        long elapsedTime = System.currentTimeMillis() - startTime;
        long seconds = elapsedTime / 1000;
        timeLabel.setText("Time: " + seconds + " seconds");

        if (circleCount >= MAX_CIRCLES) {
            timeline.stop();
        }
    }

    private void handleMouseClick(MouseEvent event) {
        if (circleCount < MAX_CIRCLES) {
            Circle circle = createRandomCircle();
            circle.setOnMouseClicked(e -> handleCircleClick(circle));
            circleCount++;
        }
    }

    private Circle createRandomCircle() {
        double x = RANDOM.nextDouble() * (WIDTH - 2 * CIRCLE_RADIUS) + CIRCLE_RADIUS;
        double y = RANDOM.nextDouble() * (HEIGHT - 2 * CIRCLE_RADIUS) + CIRCLE_RADIUS;

        Circle circle = new Circle(x, y, CIRCLE_RADIUS);
        circle.setFill(generateRandomColor());

        Pane pane = (Pane) timeLabel.getParent();
        pane.getChildren().add(circle);

        return circle;
    }

    private void handleCircleClick(Circle circle) {
        Pane pane = (Pane) circle.getParent();
        pane.getChildren().remove(circle);

        if (circleCount == 1) {
            startTime = System.currentTimeMillis();
            timeline.play();
        }
    }

    private Color generateRandomColor() {
        return Color.rgb(RANDOM.nextInt(256),
                         RANDOM.nextInt(256),
                         RANDOM.nextInt(256));
    }

    private void startNewGame() {
        circleCount = 0;
        timeLabel.setText("Time: 0 seconds");
        timeline.stop();
    }
}
