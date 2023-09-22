package org.mrdrprof.solutions.chapter_14_javafx_basics.theory

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class ButtonInPaneKt : Application() {
   
    override fun start(primaryStage: Stage) {
        // Create a scene and place a button in the scene
        val pane = StackPane()
        pane.children.add(Button("OK"))
        val scene = Scene(pane, 200.0, 50.0)
        primaryStage.title = "Button in a pane" // Set the stage title
        primaryStage.scene = scene // Place the scene in the stage
        primaryStage.show() // Display the stage
    }
}
