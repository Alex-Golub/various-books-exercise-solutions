package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * *14.28 (Random time) Modify the ClockPane class with three new Boolean properties—hourHandVisible, minuteHandVisible, and
 * secondHandVisible—and their associated accessor and mutator methods.
 * You can use the set methods to make a hand visible or invisible. Write a test
 * program that displays only the hour and minute hands. The hour and minute
 * values are randomly generated. The hour is between 0 and 11, and the minute is
 * either 0 or 30, as shown in Figure 14.52b.
 *
 * @author Alex Golub
 * @since July 22, 2023 12:36 PM
 */
public class Ex1428 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ClockPaneWithBooleanProperties clock = new ClockPaneWithBooleanProperties()
                .setHourHandVisible(true)
                .setMinuteHandVisible(true)
                .setSecondHandVisible(false);
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

@Getter
@Setter
@Accessors(chain = true)
class ClockPaneWithBooleanProperties extends Pane {
    
    private int hour;
    private int minute;
    private int second;
    private boolean hourHandVisible;
    private boolean minuteHandVisible;
    private boolean secondHandVisible;

    public ClockPaneWithBooleanProperties() {
        setCurrentTime();
    }

    public ClockPaneWithBooleanProperties(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        setCurrentTime();
    }

    public void setCurrentTime() {
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar();

        // Set current hour, minute, and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock(); // Repaint the clock
    }

    private void paintClock() {
        double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        Circle circle = createClockCircle(centerX, centerY, clockRadius);
        Text[] texts = createClockNumbers(centerX, centerY, clockRadius);
        Line sLine = createClockHand(centerX, centerY, clockRadius * 0.8, second, Color.RED, secondHandVisible);
        Line mLine = createClockHand(centerX, centerY, clockRadius * 0.65, minute, Color.BLUE, minuteHandVisible);
        Line hLine = createClockHand(centerX, centerY, clockRadius * 0.5, hour % 12 + minute / 60.0, Color.GREEN, hourHandVisible);

        getChildren().clear();
        getChildren().addAll(circle, texts[0], texts[3], texts[6], texts[9]);

        if (secondHandVisible) {
            getChildren().add(sLine);
        }

        if (minuteHandVisible) {
            getChildren().add(mLine);
        }

        if (hourHandVisible) {
            getChildren().add(hLine);
        }
    }

    private Circle createClockCircle(double centerX, double centerY, double radius) {
        Circle circle = new Circle(centerX, centerY, radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        return circle;
    }

    private Text[] createClockNumbers(double centerX, double centerY, double radius) {
        Text[] texts = new Text[12];
        for (int i = 0; i < 12; i++) {
            int time = (i + 3 > 12) ? i + 3 - 12 : i + 3;
            Point2D b = new Point2D(
                    centerX + radius * Math.cos(i * 2 * Math.PI / 12),
                    centerY + radius * Math.sin(i * 2 * Math.PI / 12));
            b = getPointBCloserToA(centerX, centerY, b, 0.82);
            texts[i] = new Text(b.getX() - (radius * 0.03125), b.getY() + (radius * 0.025), "" + time);
        }
        return texts;
    }

    private Line createClockHand(double centerX, double centerY, double length, double angle, Color color, boolean visible) {
        double handX = centerX + length * Math.sin(angle * (2 * Math.PI / 60));
        double handY = centerY - length * Math.cos(angle * (2 * Math.PI / 60));
        Line line = new Line(centerX, centerY, handX, handY);
        line.setStroke(color);
        line.setVisible(visible);
        return line;
    }

    private Point2D getPointBCloserToA(double aX, double aY, Point2D b, double coefficient) {
        double deltaX = b.getX() - aX;
        double deltaY = b.getY() - aY;
        return new Point2D(aX + coefficient * deltaX, aY + coefficient * deltaY);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paintClock();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paintClock();
    }
}
