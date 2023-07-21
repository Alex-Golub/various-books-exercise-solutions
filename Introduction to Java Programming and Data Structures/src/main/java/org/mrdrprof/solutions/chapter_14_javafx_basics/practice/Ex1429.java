package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.mrdrprof.solutions.utils.chapter_14.BeanMachinePane;

public class Ex1429 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        BeanMachinePane pane = new BeanMachinePane();

        System.out.println(pane.getWidth());
        Scene scene = new Scene(pane, pane.getWidth(), pane.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bean Machine");
        primaryStage.show();
    }
}
