package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * *14.15 (Display a STOP sign) Write a program that displays a STOP sign, as shown
 * in Figure 14.47b. The octagon is in red and the sign is in white. (Hint: Place an
 * octagon and a text in a stack pane.)
 *
 * @author Alex Golub
 * @since July 21, 2023 10:31 PM
 */
public class Ex1415 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StopSign stopSign = new StopSign();

        Scene scene = new Scene(stopSign, 200, 200);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class StopSign extends StackPane {
    public StopSign() {
        drawOctagon();
        drawText();
    }

    private void drawOctagon() {
        double centerX = 100;
        double centerY = 100;
        double radius = 80;

        Polygon octagon = new Polygon();
        for (int i = 0; i < 8; i++) {
            double angle = Math.PI / 8 + i * Math.PI / 4;
            double x = centerX + radius * Math.cos(angle);
            double y = centerY + radius * Math.sin(angle);
            
            octagon.getPoints().addAll(x, y);
        }

        octagon.setFill(Color.RED);
        getChildren().add(octagon);
    }

    private void drawText() {
        Text text = new Text("STOP");
        text.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        text.setFill(Color.WHITE);
        getChildren().add(text);
    }
}
