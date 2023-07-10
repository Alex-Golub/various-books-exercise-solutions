package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * @author Alex Golub
 * @since July 15, 2023 1:05 PM
 */
public class FlowPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane(10,
                                         10,
                                         new Button("Button 1"),
                                         new Button("Button 2"),
                                         new Button("Button 3"),
                                         new Button("Button 4"));

        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.show();
    }
}
