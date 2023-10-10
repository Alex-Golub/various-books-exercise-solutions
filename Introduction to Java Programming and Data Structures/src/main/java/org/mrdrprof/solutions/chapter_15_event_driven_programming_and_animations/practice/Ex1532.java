package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.mrdrprof.solutions.chapter_14_javafx_basics.theory.ClockPane;

/**
 * *15.32 (Control a clock) Modify Listing 14.21, ClockPane.java, to add the animation
 * into this class and add two methods start() and stop() to start and stop the
 * clock, respectively. Write a program that lets the user control the clock with the
 * Start and Stop buttons, as shown in Figure 15.38a.
 *
 * @author Alex Golub
 * @since October 10, 2023 8:45 PM
 */
public class Ex1532 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clockPane = new ClockPane();
        clockPane.start();

        Button btStart = new Button("Start");
        btStart.setOnAction(e -> clockPane.start());
        Button btStop = new Button("Stop");
        btStop.setOnAction(e -> clockPane.stop());

        HBox hBox = new HBox(btStart, btStop);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.CENTER);
        BorderPane borderPane = new BorderPane(clockPane, null, null, hBox, null);

        primaryStage.setScene(new Scene(borderPane, 500, 500));
        primaryStage.setTitle("*Ex1532");
        primaryStage.show();
    }
}
