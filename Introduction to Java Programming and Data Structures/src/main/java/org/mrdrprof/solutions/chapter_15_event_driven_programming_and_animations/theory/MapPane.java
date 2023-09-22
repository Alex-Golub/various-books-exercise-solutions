package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapPane extends BorderPane {

    private final Group group = new Group();

    public MapPane() {
        // Load coordinates from a file
        List<List<Point2D>> points = getPoints();

        // Add points to the polygon list
        for (List<Point2D> point : points) {
            Polygon state = new Polygon();
            // Add points to the state list
            for (Point2D point2D : point) {
                state.getPoints().addAll(point2D.getX(), -point2D.getY());
            }
            state.setFill(Color.WHITE);
            state.setStroke(Color.BLACK);
            state.setStrokeWidth(1 / 14.0);

            state.setOnMouseClicked(e -> {
                if (e.getButton() == MouseButton.PRIMARY) {
                    state.setFill(Color.RED);
                } else if (e.getButton() == MouseButton.SECONDARY) {
                    state.setFill(Color.BLUE);
                } else {
                    state.setFill(Color.WHITE);
                }
            });

            group.getChildren().add(state);
        }

        group.setScaleX(14);
        group.setScaleY(14);
        this.setCenter(group);
    }

    public void enlarge() {
        group.setScaleX(1.1 * group.getScaleX());
        group.setScaleY(1.1 * group.getScaleY());
    }

    public void shrink() {
        group.setScaleX(0.9 * group.getScaleX());
        group.setScaleY(0.9 * group.getScaleY());
    }

    private List<List<Point2D>> getPoints() {
        List<List<Point2D>> points = new ArrayList<>();

        try (Scanner input = new Scanner(new URL("https://liveexample.pearsoncmg.com/data/usmap.txt").openStream())) {
            while (input.hasNext()) {
                String line = input.nextLine();
                if (Character.isAlphabetic(line.charAt(0))) {
                    points.add(new ArrayList<>()); // For a new state 
                } else { // Scan one point
                    try (Scanner nextPoint = new Scanner(line)) {
                        double y = nextPoint.nextDouble();
                        double x = nextPoint.nextDouble();
                        points.get(points.size() - 1)
                              .add(new Point2D(x, y));
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return points;
    }
}
