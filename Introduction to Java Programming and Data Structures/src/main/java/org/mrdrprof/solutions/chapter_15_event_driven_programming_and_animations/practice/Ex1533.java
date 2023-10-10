package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Alex Golub
 * @since October 10, 2023 9:00 PM
 */
public class Ex1533 extends Application {

    @Override
    public void start(Stage primaryStage) {

        TBeanMachinePane pane = new TBeanMachinePane(8, 600, 600);

        Text text = new Text(20, 20, "");

        pane.setOnMouseMoved(e -> text.setText("x = " + e.getX() + "\n" + "y = " + e.getY()));

        Scene scene = new Scene(new StackPane(pane));

        primaryStage.setScene(scene);
        pane.getChildren().add(text);
        primaryStage.setTitle("***Ex1533");
        primaryStage.show();

        for (int i = 0; i < 10; i++) {
            pane.dropBall();
        }

    }
}
