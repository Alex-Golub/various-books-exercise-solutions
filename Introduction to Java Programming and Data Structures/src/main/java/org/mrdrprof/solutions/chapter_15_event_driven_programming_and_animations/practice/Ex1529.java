package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * **15.29 (Racing car) Write a program that simulates car racing, as shown in
 * Figure 15.36a. The car moves from left to right. When it hits the right end, it
 * restarts from the left and continues the same process. You can use a timer to
 * control animation. Redraw the car with new base coordinates (x, y), as shown in
 * Figure 15.36b. Also let the user pause/resume the animation with a button
 * press/release and increase/decrease the car speed by pressing the up and down
 * arrow keys.
 *
 * @author Alex Golub
 * @since October 10, 2023 7:44 PM
 */
public class Ex1529 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        CarPane carPane = new CarPane(600, 200);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> carPane.moveCar(1)));
        timeline.setCycleCount(carPane.getOneCycleDuration());
        timeline.play();
        timeline.setOnFinished(e -> {
            carPane.reset();
            timeline.play();
        });

        // Buttons pause, resume, increase, decrease
        Button pause = new Button("Pause");
        pause.setOnAction(e -> timeline.pause());
        Button resume = new Button("Resume");
        resume.setOnAction(e -> timeline.play());
        Button increase = new Button("Increase");
        increase.setOnAction(e -> timeline.setRate(timeline.getCurrentRate() + 1));

        Button decrease = new Button("Decrease");
        decrease.setOnAction(e -> {
            if (timeline.getCurrentRate() <= 0) {
                return;
            }
            timeline.setRate(timeline.getCurrentRate() - 1);
        });

        HBox hButtons = new HBox(pause, resume, increase, decrease);
        hButtons.setSpacing(10);
        hButtons.setAlignment(Pos.CENTER);
        hButtons.setPadding(new Insets(5, 5, 5, 5));

        BorderPane borderPane = new BorderPane(carPane, null, null, hButtons, null);
        borderPane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP -> increase.fire();
                case DOWN -> decrease.fire();
                default -> System.err.println("Invalid [" + e.getCode() + "] code");
            }
        });
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("**Ex1529");
        primaryStage.show();

    }

    private static class CarPane extends Pane {

        private final double width;
        private final double height;

        // left Tire x,y and radius
        private final double tireX;
        private final double tireY;
        private final double tireRadius;

        Circle[] tires = new Circle[2]; // Index 0, 1 = left and right tire
        Polyline cover = new Polyline();
        ObservableList<Double> points;
        Rectangle base;

        private CarPane(double width, double height) {
            // Get width height and measurements for the left tire (starting point)
            this.width = width;
            this.height = height;
            tireX = width * 0.2;
            tireY = height * 0.9;
            tireRadius = height * 0.1;

            // set MIN and MAX width
            setMinWidth(width);
            setMinHeight(height);

            setMaxWidth(width);
            setMaxHeight(height);

            reset(); // draws and adjusts car to starting position
        }

        public void reset() {
            if (points != null) {
                points.clear();
            }
            getChildren().clear();
            drawCar();
            moveCar(tireRadius * 13 * -1);
        }

        public void drawCar() {
            for (int i = 0; i < tires.length; i++) {
                tires[i] = new Circle(tireX + (i * 4 * tireRadius), tireY, tireRadius);
                tires[i].setStroke(Color.BLACK);
                tires[i].setFill(Color.BLACK);

            }

            double baseX = tires[0].getCenterX() - tires[0].getRadius() * 3;
            double baseY = tires[0].getCenterY() - tires[0].getRadius() * 3;
            base = new Rectangle(baseX, baseY, tireRadius * 10, tireRadius * 2);
            base.setFill(Color.LIGHTGREEN);
            base.setStroke(Color.BLACK);

            // draw the car's top cover
            double startX = base.getX() + tireRadius * 2;
            double startY = base.getY();
            double currentX = startX;
            double currentY = startY;

            points = cover.getPoints();

            double distance = tireRadius * 2;
            points.addAll(currentX, currentY); // start point

            currentX += distance;
            currentY -= distance;
            points.addAll(currentX, currentY); // up right

            currentX += distance;
            points.addAll(currentX, currentY); // right

            currentX += distance;
            currentY += distance;
            points.addAll(currentX, currentY); // down right

            points.addAll(startX, startY); // connect to starting point
            cover.setFill(Color.INDIANRED);

            getChildren().addAll(tires);
            getChildren().add(base);
            getChildren().add(cover);
        }

        private void moveCar(double distance) {
            for (Circle c : tires) {
                c.setCenterX(c.getCenterX() + distance);
            }

            base.setX(base.getX() + distance);

            for (int i = 0; i < points.size(); i += 2) {
                points.set(i, points.get(i) + distance);
            }
        }

        public int getOneCycleDuration() {
            return (int) width;
        }
    }
}
