package org.mrdrprof.solutions.chapter_14_javafx_basics.theory

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.stage.Stage

class MyJavaFXKt : Application() {
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     * to run the class invoke ./gradlew run or gradle run from the Gradle GUI
     */
   
    override fun start(primaryStage: Stage) {
        // Create a button and place it in the scene
        val btOK = Button("OK")
        val scene = Scene(btOK, 200.0, 250.0)
        primaryStage.title = "MyJavaFX" // Set the stage title
        primaryStage.scene = scene // Place the scene in the stage
        primaryStage.show() // Display the stage
    }
}
