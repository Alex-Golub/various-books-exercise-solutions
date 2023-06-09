package chapter_12_exception_handling_and_text_io;

import utils.chapter_11.Triangle;
import utils.exceptions.IllegalTriangleException;

/**
 * *12.5 (IllegalTriangleException)
 *
 * @author Alex Golub
 * @since 09/06/2023 11:46 AM
 */
class Ex5 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1, 1);
        System.out.println("triangle = " + triangle);

        try {
            new Triangle("Green", true, 1, 2, 3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
