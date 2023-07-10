package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

class BindingDemo {

    private static final String TEMPLATE = "d1 is %s and d2 is %s%n"; 
    
    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);

        d1.bind(d2);
        System.out.printf(TEMPLATE, d1.getValue(), d2.getValue()); // -> d1 is 2.0 and d2 is 2.0
        d2.setValue(70.2);
        System.out.printf(TEMPLATE, d1.getValue(), d2.getValue()); // -> d1 is 70.2 and d2 is 70.2

        d1.bind(d2.multiply(2));
        System.out.printf(TEMPLATE, d1.getValue(), d2.getValue()); // -> d1 is 140.4 and d2 is 70.2
        d2.setValue(10);
        System.out.printf(TEMPLATE, d1.getValue(), d2.getValue()); // -> d1 is 20.0 and d2 is 10.0

        d1.bind(d2.add(2));
        System.out.printf(TEMPLATE, d1.getValue(), d2.getValue()); // -> d1 is 12.0 and d2 is 10.0
        d2.setValue(5);
        System.out.printf(TEMPLATE, d1.getValue(), d2.getValue()); // -> d1 is 7.0 and d2 is 5.0
    }
}
