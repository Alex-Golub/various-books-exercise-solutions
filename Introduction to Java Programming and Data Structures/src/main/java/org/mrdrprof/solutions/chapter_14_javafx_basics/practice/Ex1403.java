package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.mrdrprof.solutions.utils.chapter_14.ImageLocationUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * *14.3 (Display three cards) Write a program that displays three cards randomly
 * selected from a deck of 52, as shown in Figure 14.43c. The card image files are
 * named 1.png, 2.png, . . . , 52.png and stored in the image/card directory. All
 * three cards are distinct and selected randomly. (Hint: You can select random
 * cards by storing the numbers 1–52 to an array list, perform a random shuffle
 * introduced in Section 11.12, and use the first three numbers in the array list as
 * the file names for the image.)
 *
 * @author Alex Golub
 * @since July 19, 2023 7:43 PM
 */
public class Ex1403 extends Application {

    private static final int TOTAL_CARDS = 52;

    @Override
    public void start(Stage primaryStage) throws Exception {
        String cardsDirectory = ImageLocationUtils.getCardsDirectory();

        HBox hBox = new HBox(10);
        List<Integer> list = IntStream.rangeClosed(1, TOTAL_CARDS)
                                      .boxed()
                                      .collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(list);

        for (int i = 0; i < 3; i++) {
            hBox.getChildren().add(new ImageView("%s/%d.png".formatted(cardsDirectory, list.get(i))));
        }

        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex1403");
        primaryStage.show();
    }
}
