package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.theory;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

class ObservablePropertyDemo {

    public static void main(String[] args) {
        DoubleProperty balance = new SimpleDoubleProperty();
        balance.addListener(observable -> System.out.println("The new value is " + balance.doubleValue()));
        balance.set(4.5);
    }
}
