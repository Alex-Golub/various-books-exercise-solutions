package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Alex Golub
 * @since July 14, 2023 6:57 PM
 */
public class StackPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));
        
        stackPane.setStyle("-fx-background-color: #7b8db1");
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        stackPane.getChildren().addAll(button1, button2);
        StackPane.setMargin(button1, new Insets(0, 100, 0, 0));
        StackPane.setMargin(button2, new Insets(0, 0, 0, 100));
        
        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("StackPane Example");
        primaryStage.show();
    }
}
