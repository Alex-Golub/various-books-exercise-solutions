package org.mrdrprof.solutions.chapter_14_javafx_basics.theory

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.stage.Stage

class ShowCircleKt : Application() {
   
    override fun start(primaryStage: Stage) {
        // Create a circle and set its properties
        val circle = Circle()
        circle.centerX = 100.0
        circle.centerY = 100.0
        circle.radius = 50.0
        circle.stroke = Color.BLACK // Set circle stroke color
        circle.fill = Color.WHITE

        // Create a pane to hold the circle 
        val pane = Pane()
        pane.children.add(circle)

        // Create a scene and place it in the stage
        val scene = Scene(pane, 200.0, 200.0)
        primaryStage.title = "ShowCircleKt" // Set the stage title
        primaryStage.scene = scene // Place the scene in the stage
        primaryStage.show() // Display the stage
    }

    companion object {
        /**
         * The main method is only needed for the IDE with limited
         * JavaFX support. Not needed for running from the command line.
         */
        @JvmStatic
        fun main(args: Array<String>) {
            launch(*args)
        }
    }
}
