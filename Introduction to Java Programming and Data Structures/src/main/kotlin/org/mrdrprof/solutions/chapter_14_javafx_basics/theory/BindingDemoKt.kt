package org.mrdrprof.solutions.chapter_14_javafx_basics.theory

import javafx.beans.property.DoubleProperty
import javafx.beans.property.SimpleDoubleProperty

internal object BindingDemoKt {
    @JvmStatic
    fun main(args: Array<String>) {
        val d1: DoubleProperty = SimpleDoubleProperty(1.0)
        val d2: DoubleProperty = SimpleDoubleProperty(2.0)
        d1.bind(d2) // Bind d1 with d2
        println("d1 is ${d1.value} and d2 is ${d2.value}")
        d2.value = 70.2
        println("d1 is ${d1.value} and d2 is ${d2.value}")

        d1.bind(d2)
        assert(d1.value == 70.2)
        d1.bind(d2.multiply(2))
        assert(d1.value == 140.4 && d2.value == 70.2)
        d2.setValue(10)
        assert(d1.value == 20.0)
        d1.bind(d2.add(2))
        assert(d1.value == 12.0)
        d2.setValue(5)
        assert(d1.value == 7.0)
    }
}
