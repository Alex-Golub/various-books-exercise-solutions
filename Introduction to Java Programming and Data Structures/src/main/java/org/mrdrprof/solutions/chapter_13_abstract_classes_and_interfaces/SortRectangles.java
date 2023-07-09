package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_11.GeometricObject;
import org.mrdrprof.solutions.utils.chapter_13.ComparableRectangle;

import java.util.Arrays;

class SortRectangles {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };

        Arrays.sort(geometricObjects);

        for (GeometricObject geometricObject : geometricObjects) {
            System.out.print(geometricObject + " ");
            System.out.println();
        }
    }
}
