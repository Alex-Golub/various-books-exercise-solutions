package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 14.5 (Characters around circle) Write a program that displays a string “Welcome to
 * Java” around the circle, as shown in Figure 14.44b. (Hint: You need to display
 * each character in the right location with appropriate rotation using a loop.)
 *
 * @author Alex Golub
 * @since July 21, 2023 3:05 PM
 */
public class Ex1405 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        String message = "Welcome to Java";
        Font font = Font.font("JetBrains Mono", FontWeight.EXTRA_BOLD, 30);

        // Circle equation parameters
        double centerX = 200;
        double centerY = 200;
        double radius = 100;
        double angle = 0;
        double angleIncrement = 360.0 / (message.length() + 1);

        for (char ch : message.toCharArray()) {
            // Compute the position (x, y) of each character on a circle based on the angle (angle) 
            // at which it should be placed
            double x = centerX + radius * Math.cos(Math.toRadians(angle));
            double y = centerY + radius * Math.sin(Math.toRadians(angle));

            Text text = new Text(x, y, String.valueOf(ch));
            text.setRotate(angle + 90); // Adjust rotation
            text.setFont(font);
            text.setFill(Color.BLACK);

            angle += angleIncrement;
            
            pane.getChildren().add(text);
        }

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Ex1405");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
