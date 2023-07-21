package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

/**
 * 14.4 (Color and font) Write a program that displays five texts vertically, as shown in
 * Figure 14.44a. Set a random color and opacity for each text and set the font of
 * each text to Times Roman, bold, italic, and 22 pixels.
 *
 * @author Alex Golub
 * @since July 21, 2023 2:47 PM
 */
public class Ex1404 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);

        for (int i = 0; i < 5; i++) {
            Text text = new Text("Java");
            text.setFill(randomColor());
            text.setFont(Font.font("JetBrains Mono",
                                   FontWeight.BOLD,
                                   FontPosture.ITALIC,
                                   22));
            text.setRotate(90);
            
            hBox.getChildren().add(text);
        }

        primaryStage.setScene(new Scene(hBox, 300, 150));
        primaryStage.setTitle("Ex1404");
        primaryStage.show();
    }

    @NotNull
    private static Color randomColor() {
        return new Color(Math.random(),
                         Math.random(),
                         Math.random(),
                         Math.random());
    }
}
