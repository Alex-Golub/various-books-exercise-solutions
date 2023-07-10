package org.mrdrprof.solutions.chapter_14_javafx_basics.theory

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class NodeStyleRotateDemoKt : Application() {
    override fun start(primaryStage: Stage) {
        val pane = StackPane()
        val btOK = Button("OK")
        btOK.style = "-fx-border-color: blue;"
        pane.children.add(btOK)
        pane.rotate = 45.0 // Rotate pane 45 degrees
        btOK.style = "-fx-border-color: blue; " +
                "-fx-text-fill: red; " +
                "-fx-rotate: -15;" +
                "-fx-scale-x: 1.5;" + "-fx-scale-y: 1.5"
        val scene = Scene(pane, 200.0, 250.0)
        primaryStage.title = "org.mrdrprof.solutions.chapter_14_javafx_basics.NodeStyleRotateDemo" // Set the stage title
        primaryStage.scene = scene // Place the scene in the stage
        primaryStage.show() // Display the stage
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(*args)
        }
    }
}
