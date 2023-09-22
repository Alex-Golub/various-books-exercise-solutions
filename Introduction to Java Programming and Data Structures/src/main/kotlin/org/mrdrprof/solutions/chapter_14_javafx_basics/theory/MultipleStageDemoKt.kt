package org.mrdrprof.solutions.chapter_14_javafx_basics.theory

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.stage.Stage

class MultipleStageDemoKt : Application() {
    init {
        println(javaClass.getDeclaredConstructor().name + " has been invoked")
    }

   
    override fun start(primaryStage: Stage) {
        // Create a scene and place a button in the scene
        val scene = Scene(Button("OK"), 200.0, 250.0)
        primaryStage.title = "MyJavaFX" // Set the stage title
        primaryStage.scene = scene // Place the scene in the stage
        primaryStage.show() // Display the stage
        val stage = Stage() // Create a new stage
        stage.title = "Second Stage" // Set the stage title
        // Set a scene with a button in the stage
        stage.scene = Scene(Button("New Stage"), 200.0, 250.0)
        stage.isResizable = false
        stage.show() // Display the stage
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
