package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * *15.8 (Display the mouse position) Write two programs, such that one displays the
 * mouse position when the mouse button is clicked (see Figure 15.28a), and the
 * other displays the mouse position when the mouse button is pressed and ceases
 * to display it when the mouse button is released.
 *
 * @author Alex Golub
 * @since October 03, 2023 8:37 PM
 */
public class Ex1508 extends Application {

    static final String MOUSE_POSITION_TEMPLATE = "Mouse Position: (%.1f, %.1f)";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text positionText = new Text("Click on scene to get mouse coordinates");
        positionText.setFont(Font.font("JetBrains Mono", 18));

        StackPane stackPane = new StackPane(positionText);

        stackPane.setOnMouseClicked(event -> positionText.setText(MOUSE_POSITION_TEMPLATE.formatted(event.getSceneX(), event.getSceneY())));

        // displays the mouse position when the mouse button is pressed and ceases to display it when the mouse button is released.
//        stackPane.setOnMousePressed(event -> positionText.setText(MOUSE_POSITION_TEMPLATE.formatted(event.getSceneX(), event.getSceneY())));
//        stackPane.setOnMouseReleased(event -> positionText.setText(""));

        primaryStage.setScene(new Scene(stackPane, 800, 800));
        primaryStage.setTitle("Ex1508");
        primaryStage.show();
    }
}
