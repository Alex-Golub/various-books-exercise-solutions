package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.mrdrprof.solutions.utils.chapter_14.ImageLocationUtils;

import java.io.File;
import java.util.stream.IntStream;

/**
 * @author Alex Golub
 * @since October 10, 2023 7:55 PM
 */
public class Ex1530 extends Application {

    private static final int NUMBER_OF_CARDS = 54;
    private static final double ANIMATION_SPEED = 0.05;

    private static int imageIndex = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image[] cards = IntStream.range(0, NUMBER_OF_CARDS)
                                 .mapToObj(idx -> new Image(ImageLocationUtils.getCardsDirectory() + File.separator + (1 + idx) + ".png"))
                                 .toArray(Image[]::new);

        ImageView imageView = new ImageView(cards[0]);
        StackPane stackPane = new StackPane(imageView);

        primaryStage.setScene(new Scene(stackPane, 200, 200));
        primaryStage.setTitle("**Ex1530");
        primaryStage.show();

        Timeline slideshow = new Timeline(
                new KeyFrame(Duration.seconds(ANIMATION_SPEED),
                             event -> imageView.setImage(cards[++imageIndex % cards.length])));
        slideshow.setCycleCount(Animation.INDEFINITE);
        slideshow.play();

        stackPane.setOnMouseClicked(event -> {
            if (slideshow.getStatus() == Animation.Status.PAUSED) {
                slideshow.play();
            } else {
                slideshow.pause();
            }
        });
    }
}
