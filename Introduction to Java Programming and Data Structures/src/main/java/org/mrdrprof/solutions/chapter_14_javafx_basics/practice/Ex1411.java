package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * *14.11 (Paint a smiley face) Write a program that paints a smiley face, as shown in
 * Figure 14.46a.
 *
 * @author Alex Golub
 * @since July 21, 2023 9:53 PM
 */
public class Ex1411 extends Application {

    private static final double CENTER_X = 200;
    private static final double CENTER_Y = 200;
    private static final double RADIUS = 100;
    private static final double EYE_RADIUS_X = RADIUS / 4;
    private static final double EYE_RADIUS_Y = RADIUS / 6;
    private static final double PUPIL_RADIUS = EYE_RADIUS_Y / 1.2;
    private static final double SMILE_RADIUS_X = RADIUS / 2;
    private static final double SMILE_RADIUS_Y = RADIUS / 4;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        drawSmileyFace(pane);
        Scene scene = new Scene(pane, CENTER_X + RADIUS * 2, CENTER_Y + RADIUS * 2);
        primaryStage.setScene(scene);
        primaryStage.setTitle(getClass().getSimpleName());
        primaryStage.show();
    }

    private void drawSmileyFace(Pane pane) {
        drawFace(pane);
        drawEyes(pane);
        drawSmile(pane);
        drawNose(pane);
    }

    private void drawFace(Pane pane) {
        Circle face = new Circle(CENTER_X, CENTER_Y, RADIUS);
        face.setStroke(Color.BLACK);
        face.setFill(Color.TRANSPARENT);
        
        pane.getChildren().add(face);
    }

    private void drawEyes(Pane pane) {
        double eye1X = CENTER_X - RADIUS / 2.8;
        double eye2X = CENTER_X + RADIUS / 2.8;
        double eyeY = CENTER_Y - RADIUS / 2.8;

        Ellipse eye1 = new Ellipse(eye1X, eyeY, EYE_RADIUS_X, EYE_RADIUS_Y);
        Ellipse eye2 = new Ellipse(eye2X, eyeY, EYE_RADIUS_X, EYE_RADIUS_Y);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.TRANSPARENT);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.TRANSPARENT);
        
        pane.getChildren().addAll(eye1, eye2);

        drawPupils(pane, eye1X, eyeY);
        drawPupils(pane, eye2X, eyeY);
    }

    private void drawPupils(Pane pane, double eyeX, double eyeY) {
        Circle pupil = new Circle(eyeX, eyeY, PUPIL_RADIUS);
        pupil.setFill(Color.BLACK);
        
        pane.getChildren().add(pupil);
    }

    private void drawSmile(Pane pane) {
        Arc smile = new Arc(CENTER_X,
                            CENTER_Y + RADIUS / 3,
                            SMILE_RADIUS_X,
                            SMILE_RADIUS_Y,
                            0,
                            -180);
        smile.setFill(Color.TRANSPARENT);
        smile.setStroke(Color.BLACK);
        
        pane.getChildren().add(smile);
    }

    private void drawNose(Pane pane) {
        double noseTopX = CENTER_X;
        double noseTopY = CENTER_Y - RADIUS / 4;
        double noseLeftX = CENTER_X - RADIUS / 4;
        double noseLeftY = CENTER_Y + RADIUS / 4;
        double noseRightX = CENTER_X + RADIUS / 4;
        double noseRightY = CENTER_Y + RADIUS / 4;

        Line noseTop = new Line(noseLeftX, noseLeftY, noseRightX, noseRightY);
        Line noseLeft = new Line(noseLeftX, noseLeftY, noseTopX, noseTopY);
        Line noseRight = new Line(noseRightX, noseRightY, noseTopX, noseTopY);
        
        pane.getChildren().addAll(noseTop, noseLeft, noseRight);
    }
}
