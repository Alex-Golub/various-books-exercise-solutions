package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);

        // create source object
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");

        // create handler object
        OKHandler handler1 = new OKHandler();
        // register handler
        btOK.setOnAction(handler1);

        CancelHandler handler2 = new CancelHandler();
        btCancel.setOnAction(handler2);

        pane.getChildren().addAll(btOK, btCancel);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("HandleEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class OKHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        System.out.println("OK button clicked");
    }
}

class CancelHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        System.out.println("Cancel button clicked");
    }
}
