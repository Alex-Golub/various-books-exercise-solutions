package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Alex Golub
 * @since July 14, 2023 9:24 PM
 */
public class ImageViewExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Image image = new Image("http://liveexample.pearsoncmg.com/book/image/us.gif");

        ImageView imageView1 = new ImageView(image);
        ImageView imageView2 = new ImageView(image);

        HBox hbox = new HBox(imageView1, imageView2);
        hbox.setPadding(new Insets(20));
        hbox.setSpacing(20);
        Scene scene = new Scene(hbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
