package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * **14.12 (Display a bar chart) Write a program that uses a bar chart to display the
 * percentages of the overall grade represented by projects, quizzes, midterm
 * exams, and the final exam, as shown in Figure 14.46b. Suppose projects take
 * 20% and are displayed in red, quizzes take 10% and are displayed in blue,
 * midterm exams take 30% and are displayed in green, and the final exam takes
 * 40% and is displayed in orange. Use the Rectangle class to display the bars.
 * Interested readers may explore the JavaFX BarChart class for further study.
 *
 * @author Alex Golub
 * @since July 21, 2023 10:10 PM
 */
public class Ex1412 extends Application {

    @Override
    public void start(Stage primaryStage) {
        double height = 300;
        double paneHeight = 150;
        
        Rectangle r1 = new Rectangle(10, paneHeight - height * 0.2, 100, height * 0.2);
        r1.setFill(Color.RED);
        Text text1 = new Text(10, paneHeight - height * 0.2 - 10, "Project -- 20%");

        Rectangle r2 = new Rectangle(10 + 110, paneHeight - height * 0.1, 100, height * 0.1);
        r2.setFill(Color.BLUE);
        Text text2 = new Text(10 + 110, paneHeight - height * 0.1 - 10, "Quiz -- 10%");

        Rectangle r3 = new Rectangle(10 + 220, paneHeight - height * 0.3, 100, height * 0.3);
        r3.setFill(Color.GREEN);
        Text text3 = new Text(10 + 220, paneHeight - height * 0.3 - 10, "Midterm -- 30%");

        Rectangle r4 = new Rectangle(10 + 330, paneHeight - height * 0.4, 100, height * 0.4);
        r4.setFill(Color.ORANGE);
        Text text4 = new Text(10 + 330, paneHeight - height * 0.4 - 10, "Final -- 40%");

        Group group = new Group();
        group.getChildren().addAll(r1, text1, r2, text2, r3, text3, r4, text4);

        Scene scene = new Scene(new BorderPane(group), 500, paneHeight);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
