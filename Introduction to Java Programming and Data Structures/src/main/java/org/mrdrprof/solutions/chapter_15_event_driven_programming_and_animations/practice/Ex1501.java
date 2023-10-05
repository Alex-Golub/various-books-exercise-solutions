package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.mrdrprof.solutions.utils.chapter_14.ImageLocationUtils;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * *15.1 (Pick four cards) Write a program that lets the user click the Refresh button to
 * display four cards from a deck of 52 cards, as shown in Figure 15.26a. (See the
 * hint in Programming Exercise 14.3 on how to obtain four random cards.)
 */
public class Ex1501 extends Application {

    private static final int TOTAL_CARDS = 52;
    private static final int RANDOM_CARDS_COUNT = 4;
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();
    private static final String CARDS_DIRECTORY = ImageLocationUtils.getCardsDirectory();

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox rowOfCards = new HBox();
        rowOfCards.setSpacing(10);
        rowOfCards.setAlignment(Pos.CENTER);
        setRandomCards(rowOfCards);

        Button refreshButton = new Button("Refresh");
        refreshButton.setOnAction(e -> setRandomCards(rowOfCards));

        HBox refresh = new HBox();
        refresh.setSpacing(10);
        refresh.setAlignment(Pos.BOTTOM_CENTER);
        refresh.getChildren().add(refreshButton);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(rowOfCards);
        borderPane.setBottom(refresh);
        BorderPane.setMargin(rowOfCards, new Insets(10, 10, 0, 10));
        BorderPane.setMargin(refresh, new Insets(10));

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex1403");
        primaryStage.show();
    }

    private static void setRandomCards(HBox cardsRow) {
        cardsRow.getChildren().clear();
        IntStream.range(0, RANDOM_CARDS_COUNT)
                 .forEach(i -> cardsRow.getChildren().add(new ImageView("%s/%d.png".formatted(CARDS_DIRECTORY,
                                                                                              1 + RANDOM_NUMBER_GENERATOR.nextInt(TOTAL_CARDS)))));
    }
}
