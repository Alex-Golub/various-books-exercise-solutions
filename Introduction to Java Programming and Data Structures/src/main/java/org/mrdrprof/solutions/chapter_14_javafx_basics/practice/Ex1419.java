package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.function.DoubleFunction;

/**
 * **14.19 (Plot the sine and cosine functions) Write a program that plots the sine function
 * in red and cosine in blue, as shown in Figure 14.48c.
 * Hint: The Unicode for p is π. To display -2p, use Text(x, y, "–2\
 * u03c0"). For a trigonometric function like sin(x), x is in radians. Use the
 * following loop to add the points to a polyline:
 * Polyline polyline = new Polyline();
 * ObservableList<Double> list = polyline.getPoints();
 * double scaleFactor = 50;
 * for (int x = −170; x <= 170; x++) {
 * list.add(x + 200.0);
 * list.add(100 – scaleFactor * Math.sin((x / 100.0) * 2 *
 * Math.PI));
 * }
 * <p>
 * Note that x in the loop is a point in the X-Axis and x does not correspond to
 * angles in degrees. The entire expression (x / 100.0) * 2 * Math.PI represents an angle in radians.
 * When x is -100, Math.sin((x / 100.0) * 2 * Math.PI) is 0
 * When x is -75, Math.sin((x / 100.0) * 2 * Math.PI) is 1
 * When x is -50, Math.sin((x / 100.0) * 2 * Math.PI) is 0
 * When x is -25, Math.sin((x / 100.0) * 2 * Math.PI) is -1
 * When x is 0, Math.sin((x / 100.0) * 2 * Math.PI) is 0
 * When x is 25, Math.sin((x / 100.0) * 2 * Math.PI) is 1
 * When x is 50, Math.sin((x / 100.0) * 2 * Math.PI) is 0
 * When x is 75, Math.sin((x / 100.0) * 2 * Math.PI) is -1
 * When x is 100, Math.sin((x / 100.0) * 2 * Math.PI) is 0
 *
 * @author Alex Golub
 * @since July 21, 2023 10:58 PM
 */
public class Ex1419 extends Application {
    private static final double WIDTH = 500;
    private static final double HEIGHT = 200;
    private static final double CENTER_X = WIDTH / 2;
    private static final double CENTER_Y = HEIGHT / 2;
    private static final double SCALE_FACTOR = 50;
    private static final String[] PI_VALUES = { "-3π", "-2π", "-π", "0", "π", "2π", "3π" };
    private static final double PI_SCALE = CENTER_X / Math.PI;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Polyline xAxis = createAxis(0, CENTER_Y, WIDTH, CENTER_Y);
        Polyline yAxis = createAxis(CENTER_X, 0, CENTER_X, HEIGHT);

        Polyline sinePolyline = createFunctionPlot(Math::sin, Color.RED);
        Polyline cosinePolyline = createFunctionPlot(Math::cos, Color.BLUE);

        addPiPointsAlongXAxis(pane);

        pane.getChildren().addAll(xAxis, yAxis, sinePolyline, cosinePolyline);

        primaryStage.setScene(new Scene(new BorderPane(pane), WIDTH, HEIGHT));
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.show();
    }

    private Polyline createAxis(double startX, double startY, double endX, double endY) {
        Polyline axis = new Polyline(startX, startY, endX, endY);
        axis.setStroke(Color.BLACK);
        return axis;
    }

    private Polyline createFunctionPlot(DoubleFunction<Double> function, Color color) {
        Polyline polyline = new Polyline();
        ObservableList<Double> points = polyline.getPoints();

        for (int x = -170; x <= 170; x++) {
            double scaledX = CENTER_X + x;
            double scaledY = CENTER_Y - SCALE_FACTOR * function.apply((x / 100.0) * 2 * Math.PI);
            points.add(scaledX);
            points.add(scaledY);
        }

        polyline.setStroke(color);
        return polyline;
    }

    private void addPiPointsAlongXAxis(Pane pane) {
        for (int i = 1; i <= 3; i++) {
            double x = CENTER_X + PI_SCALE * i * Math.PI;
            Text piText = new Text(x - 8, CENTER_Y + 15, PI_VALUES[i + 3]);
            pane.getChildren().add(piText);
        }
        for (int i = 1; i <= 2; i++) {
            double x = CENTER_X - PI_SCALE * i * Math.PI;
            Text piText = new Text(x - 8, CENTER_Y + 15, PI_VALUES[3 - i]);
            pane.getChildren().add(piText);
        }
    }
}
