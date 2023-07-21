package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 14.1 (Display images) Write a program that displays four images in a grid pane, as
 * shown in Figure 14.43a.
 * (a) Exercise 14.1 displays four images. Source: booka/Fotolia.
 *
 * @author Alex Golub
 * @since July 19, 2023 6:48 PM
 */
public class Ex1401 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView usa = new ImageView(ImageLocationUtils.getImageDirectory() + "/usa.jpg");
        ImageView germany = new ImageView(ImageLocationUtils.getImageDirectory() + "/germany.gif");
        ImageView france = new ImageView(ImageLocationUtils.getImageDirectory() + "/france.gif");
        ImageView china = new ImageView(ImageLocationUtils.getImageDirectory() + "/china.gif");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(germany, 0, 0);
        gridPane.add(china, 1, 0);
        gridPane.add(france, 0, 1);
        gridPane.add(usa, 1, 1);

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex1401");
        primaryStage.show();
    }
}
